import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> c1 = new LinkedList<>();
        Queue<String> c2 = new LinkedList<>();
        
        for(int i = 0; i < cards1.length; i++) {
            c1.add(cards1[i]);
        }
        for(int i = 0; i < cards2.length; i++) {
            c2.add(cards2[i]);
        }
        
        for(int i = 0; i < goal.length; i++) {
            if(goal[i].equals(c1.peek())) {
                c1.remove();
            }
            else if(goal[i].equals(c2.peek())) {
                c2.remove();
            }
            else {
                return "No";
            }
            
            
        }
        return "Yes";
    }
}