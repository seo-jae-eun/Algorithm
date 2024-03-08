class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] factors = new int[number];
        
        for(int i = 1; i <= number; i++) {
            int cnt = 0;
            for(int j = 1; j * j <= i; j++) {
                if(j * j == i) cnt++;
                else if(i % j == 0) cnt += 2;
            }
            factors[i - 1] = cnt;
        }
        for(int k = 0; k < factors.length; k++) {
            if(factors[k] > limit) { // 제한수치를 초과한 기사
                factors[k] = power;
            }
            answer += factors[k]; 
        }

        return answer;
    }
}
