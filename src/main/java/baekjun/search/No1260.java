package baekjun.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No1260 {

    static int map[][];
    static boolean visited[];
    static int n, m, v;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        n = input[0];
        m = input[1];
        v = input[2];
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        while (m --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;
        }
        dfs(v);
        sb.append("\n");
        Arrays.fill(visited, false);
        bfs(v);
        System.out.println(sb);
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start + " ");
        for (int i = 1; i <= n; i++)
            if (map[start][i] == 1 && visited[i] == false)
                dfs(i);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        sb.append(start + " ");

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 1; i <= n; i++) {
                if (map[cur][i] == 1 && visited[i] == false) {
                    q.offer(i);
                    visited[i] = true;
                    sb.append(i + " ");
                }
            }
        }
    }
}
