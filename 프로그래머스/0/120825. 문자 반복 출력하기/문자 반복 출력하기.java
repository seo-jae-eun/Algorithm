class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String s[] = my_string.split("");
        for(int i = 0; i < s.length; i++) {
            for(int j = 0; j < n; j++) {
                answer += s[i];
            }
        }
        return answer;
    }
}