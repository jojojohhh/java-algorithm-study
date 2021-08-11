package programmers;

import java.util.Arrays;

public class ATaxiFare {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] map = new int[n + 1][n + 1];

        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], 20000000);
            map[i][i] = 0;
        }

        for (int i = 0; i < fares.length; i++)
            map[fares[i][0]][fares[i][1]] = map[fares[i][1]][fares[i][0]] = fares[i][2];

        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map.length; j++) {
                if (i != j) {
                    for (int k = 1; k <map.length; k++) {
                        if (i != k && k != j) {
                            map[j][k] = Math.min(map[j][i] + map[i][k], map[j][k]);
                        }
                    }
                }
            }
        }

        int answer = map[s][a] + map[s][b];

        for (int i = 1; i < map.length; i++)
            answer = Math.min(answer, map[s][i] + map[i][a] + map[i][b]);

        return answer;
    }
}
