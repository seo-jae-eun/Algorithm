class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
            for(int j = 0; j < targets[i].length(); j++) {
                int min = Integer.MAX_VALUE;
                for(int k = 0; k < keymap.length; k++) {
                    if(keymap[k].indexOf(targets[i].charAt(j)) != -1 && keymap[k].indexOf(targets[i].charAt(j)) < min) {
                        min = keymap[k].indexOf(targets[i].charAt(j)) + 1;   
                    }
                }
                if(min == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                }
                else answer[i] += min;
                
                
            }
        }
   
        return answer;
    }
}