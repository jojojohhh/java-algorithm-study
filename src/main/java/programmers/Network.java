package programmers;

public class Network {

    static boolean[] visited = {};
    static int answer = 0;

    public int solution(int n, int[][] computers) {
        visited = new boolean[computers.length];
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]){
                visited[i] = true;
                dfs(computers, i, 0);
                answer++;
            }
        }
        return answer;
    }

    public static void dfs(int[][] computers, int i, int j) {
        if (j == computers[i].length)   return;
        if (computers[i][j] == 1 && !visited[j]) {
            visited[j] = true;
            dfs(computers, j, 0);
        }
        dfs(computers, i, ++j);
    }
}
