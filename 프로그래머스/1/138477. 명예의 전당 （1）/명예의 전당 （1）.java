import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<Integer>();
 
        for(int i = 0; i < score.length; i++) {
            list.add(score[i]);     
            Collections.sort(list, Collections.reverseOrder());
            if(i < k) {
                answer[i] = list.get(list.size() - 1);
            }
            else {
                answer[i] = list.get(k - 1);
            }
        }

        
        
        return answer;
    }
}