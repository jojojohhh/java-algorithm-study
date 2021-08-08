package programmers;

import java.util.Arrays;

public class Ranking {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] graph = new int[n + 1][n + 1];

        for (int[] a : results) {
            graph[a[0]][a[1]] = 1;
            graph[a[1]][a[0]] = -1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (graph[j][i] != 0){
                    for (int k = 1; k < n + 1; k++) {
                        if (graph[j][i] == graph[i][k]) {
                            graph[j][k] = graph[j][i];
                        }
                    }
                }
            }
        }

        for (int[] a : graph)   if (Arrays.stream(a).filter(x -> x != 0).toArray().length == n - 1)    answer++;

        return answer;
    }
}
