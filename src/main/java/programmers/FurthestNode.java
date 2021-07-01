package programmers;

import java.util.*;

public class FurthestNode {

    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < edge.length; i++) {
            graph.add(new ArrayList<>());
        }

        int node1, node2;
        for (int[] node: edge) {
            node1 = node[0];
            node2 = node[1];
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        int[] cost = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> que = new LinkedList<>();
        visited[1] = true;
        que.add(1);

        while (!que.isEmpty()) {
            int cur = que.poll();
            for (int node: graph.get(cur)) {
                if(!visited[node]) {
                    cost[node] = cost[cur] + 1;
                    visited[node] = true;
                    que.add(node);
                }
            }
        }

        Arrays.sort(cost);
        int max = cost[cost.length - 1];
        return (int) Arrays.stream(cost).filter(x -> x == max).count();
    }
}
