import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // HashMap으로 각 원소의 개수 계산
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : tangerine) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 중복 개수만 추출하여 리스트에 저장
        List<Integer> countsList = new ArrayList<>(countMap.values());

        // 내림차순 정렬
        Collections.sort(countsList, Collections.reverseOrder());

        // 리스트를 배열로 변환
        int[] countsArray = countsList.stream().mapToInt(Integer::intValue).toArray();

        for (int count : countsArray) {
            k = k - count;
            answer++;
            if(k < 1) break;
        }
        return answer;
    }
}