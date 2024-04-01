class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i = 0; i < skip.length(); i++) {
            alphabet = alphabet.replace(Character.toString(skip.charAt(i)), "");
        }
        System.out.println(alphabet);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            int n = alphabet.indexOf(s.charAt(i)) + index;
            sb.append((char)(alphabet.charAt(n % alphabet.length())));
        } 
        answer = sb.toString();
        return answer;
    }
}