import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> q = new LinkedList<>();

        int cntX = 0; // x와 같은 글자들이 나온 횟수
        int cntNotX = 0; // x와 다른 글자들이 나온 횟수
 
        for(int i = 0; i < s.length(); i++) { // 큐에 넣기
            q.add(s.charAt(i));
        }
        
        char c = q.peek(); // 첫 글자 x
        
        while(!q.isEmpty()) {
            if(c == q.poll()) cntX++; // x와 같을 때
            else cntNotX++; // x와 다를 때
            
            if(cntX == cntNotX) { // 두 횟수가 같아지는 순간
                answer++;
                cntX = 0;
                cntNotX = 0;
                if(q.isEmpty()) break;
                c = q.peek();
            }
            else {
                if(q.size() <= 1 && cntX > cntNotX) { // 맨끝 부분
                    answer++; 
                    break;
                } 
            }
        }
          
        return answer;
    }
}