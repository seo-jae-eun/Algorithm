import java.util.Arrays;

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = Integer.MAX_VALUE;

        // S, A, B를 출발 정점으로 했을 때 모든 정점까지의 최소 택시요금을 먼저 구한다.
        int[] startS = findPath(n, fares, s - 1);
        int[] startA = findPath(n, fares, a - 1);
        int[] startB = findPath(n, fares, b - 1);

        // 위에서 구한 배열에서 각 정점끼리의 택시요금 합을 구해서 가장 작은 값을 return
        for(int i = 0; i < n; i++) {
            answer = Math.min(answer, startS[i] + startA[i] + startB[i]);
        }

        return answer;
    }

    final int INF = Integer.MAX_VALUE;

    public int[] findPath(int nodeNum, int[][] graph, int start) {
        boolean[] visited = new boolean[nodeNum];
        int[] costs = new int[nodeNum];
        int[] path = new int[nodeNum];

        // 최단거리 배열을 무한대로 채우기
        Arrays.fill(costs, INF);
        // 부모?지나온정점? 배열을 -1로 채우기
        Arrays.fill(path, -1);

        // 시작 정점의 최단거리를 0으로 초기화
        int startNode = start;
        costs[startNode] = 0;

        for (int i = 0; i < nodeNum - 1; i++) {
            int minNode = findMinNode(costs, visited);
            if (minNode == -1) break;
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