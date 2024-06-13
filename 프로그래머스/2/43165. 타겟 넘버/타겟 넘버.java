import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int sum = 0;

        // 전달받은 numbers를 너비우선탐색으로 탐색
        //  다음 갈 수 있는 길은 +, - 가지이기 때문에 2가지의 계산 결과를 모두 큐에 넣는다.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sum);

        for(int i = 0; i < numbers.length; i++) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                sum = queue.poll();
                queue.add(sum + numbers[i]);
                queue.add(sum + (-numbers[i]));

            }
        }
        while(!queue.isEmpty()) {
            if(queue.poll() == target) {
                answer++;
            }
        }

        return answer;
    }

}