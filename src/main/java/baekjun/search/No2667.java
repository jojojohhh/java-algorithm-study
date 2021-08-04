package baekjun.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No2667 {

    static int n;
    static boolean[][] visited;
    static int[][] map;
    static int[] nums;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        map = new int[n][n];
        nums = new int[n * n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0 && !visited[i][j]) {
                    count++;
                    dfs(i, j);
                }
            }
        }
        int[] answer = Arrays.stream(nums).filter(n -> n != 0).toArray();
        Arrays.sort(answer);
        System.out.println(count);
        for (int i = 0; i < count; i++) System.out.println(answer[i]);
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        nums[count]++;

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n && map[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}
