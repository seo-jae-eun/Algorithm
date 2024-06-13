import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            // DFS
            if(!visited[i]) {
                stack.push(i);
                while(!stack.isEmpty()) {
                    int output = stack.pop();
                    if(!visited[output]) {
                        visited[output] = true;
                        for(int j = 0; j < computers[output].length; j++) {
                            if(j != output && computers[output][j] == 1) {
                                stack.push(j);
                            }
                        }
                    }
                }
                answer++;
            }
        }



        return answer;
    }
}