package programmers;

import java.util.Arrays;

public class Ranking {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] graph = new int[n + 1][n + 1];

        for (int[] a : graph) Arrays.fill(a, -1);

        for (int[] a : results) graph[a[0]][a[1]] = 1;

        return answer;
    }

    public static void main(String[] args) {
        Ranking ranking = new Ranking();
        ranking.solution(5, new int[][]{{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}});
    }
}
