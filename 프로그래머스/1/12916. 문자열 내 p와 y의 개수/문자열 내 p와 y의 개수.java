class Solution {
    boolean solution(String s) {
        boolean answer = false;

        s = s.toUpperCase();
        
        int pCount = 0;
        int yCount = 0;
        
        String pReplace = s.replace("P", "");
        String yReplace = s.replace("Y", "");
        pCount = s.length() - pReplace.length();
        yCount = s.length() - yReplace.length();

        if(pCount == yCount) {
            answer = true;
        }

        return answer;
    }
}