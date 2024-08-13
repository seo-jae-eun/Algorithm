class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += (n % 2 == 0 ? n : 0);
            n--;
        }
        return answer;
    }
}