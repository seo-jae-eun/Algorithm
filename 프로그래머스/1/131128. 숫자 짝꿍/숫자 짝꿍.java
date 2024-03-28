import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        int[] countX = new int[10];
        int[] countY = new int[10];
        List<Integer> s = new ArrayList<>();
        
        for(int i = 0; i < countX.length; i++) {
            countX[i] = countChar(X, (char)('0' + i));
            countY[i] = countChar(Y, (char)('0' + i));
        }
        for(int j = 9; j >= 0; j--) {
            if(countX[j] != 0 && countY[j] != 0) {
                for(int k = 0; k < Math.min(countX[j], countY[j]); k++) {
                    s.add(j);
                }
            }
        }
        // Collections.sort(s, Collections.reverseOrder());

        answer = s.toString().replaceAll("[^0-9]","");
        
        
        if(answer.equals("")) return "-1"; // 짝꿍이 존재하지 않을 때
        if((answer.split("")[0]).equals("0")) return "0"; // 제일 앞자리가 0일때

        return answer;
    }
    
        public static int countChar(String str, char ch) {
            return str.length() - str.replace(String.valueOf(ch), "").length();    
        }
}