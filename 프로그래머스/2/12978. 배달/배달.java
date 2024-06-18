import java.util.Arrays;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        int[] hours = findPath(N, road);
        System.out.println(Arrays.toString(hours));
        for(int i : hours) {
            if(i <= K) {
                answer++;
            }
        }

        return answer;
    }
    
    final int INF = Integer.MAX_VALUE;

    public int[] findPath(int nodeNum, int[][] graph) {
        boolean[] visited = new boolean[nodeNum];
        int[] costs = new int[nodeNum];
        int[] path = new int[nodeNum];

        Arrays.fill(costs, INF);
        Arrays.fill(path, -1);

        int startNode = 0;
        costs[startNode] = 0;

        for (int i = 0; i < nodeNum - 1; i++) {
            int minNode = findMinNode(costs, visited);
            if (minNode == -1) break; // All reachable nodes have been visited
            visited[minNode] = true;

            for (int[] edge : graph) {
                // 변경된 부분: 1 기반 인덱스를 0 기반 인덱스로 변환
                int from = edge[0] - 1;
                int to = edge[1] - 1;
                int cost = edge[2];

                if (minNode == from && !visited[to] && costs[from] + cost < costs[to]) {
                    costs[to] = costs[from] + cost;
                    path[to] = from;
                } else if (minNode == to && !visited[from] && costs[to] + cost < costs[from]) {
                    costs[from] = costs[to] + cost;
                    path[from] = to;
                }
            }
        }
        return costs;
    }

    private int findMinNode(int[] costs, boolean[] visited) {
        int minCost = INF;
        int minNode = -1;

        for (int i = 0; i < costs.length; i++) {
            if (!visited[i] && costs[i] < minCost) {
                minCost = costs[i];
                minNode = i;
            }
        }

        return minNode;
    }
}