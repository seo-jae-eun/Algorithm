import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for(int i = 0; i < countX.length; i++) {
            countX[i] = countChar(X, (char)('0' + i));
            countY[i] = countChar(Y, (char)('0' + i));
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 9; j >= 0; j--) {
            if(countX[j] == 0 || countY[j] == 0) continue;
            
            int number = Math.min(countX[j], countY[j]);
            String s = String.valueOf(j);
            while(number > 0) {
                sb.append(s);
                number--;
            }
        }
        answer = sb.toString();
        
        
        if(answer.equals("")) return "-1";
        if((answer.split("")[0]).equals("0")) return "0";

        return answer;
    }
    
        public static int countChar(String str, char ch) {
            return str.length() - str.replace(String.valueOf(ch), "").length();    
        }
}