import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> q = new LinkedList<>();

        int cntX = 0;
        int cntNotX = 0;
 
        for(int i = 0; i < s.length(); i++) { // 큐에 넣기
            q.add(s.charAt(i));
        }
        
        char c = q.peek();
        
        while(!q.isEmpty()) {
            System.out.println(c);
            if(c == q.poll()) cntX++;
            else cntNotX++;
            System.out.println(cntX);
            System.out.println(cntNotX);
            
            if(cntX == cntNotX) {
                answer++;
                cntX = 0;
                cntNotX = 0;
                if(q.isEmpty()) break;

                c = q.peek();
            }
            else {
                if(q.size() <= 1 && cntX > cntNotX) {
                    answer++; 
                    break;
                } 
            }
        }
        
        
            
        return answer;
    }
}