package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {

    public class Node {
        int x;
        int y;
        int dist;

        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public int solution(int[][] maps) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        boolean[][] visited = new boolean[maps.length][maps[0].length];

        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(0, 0, 1));
        visited[0][0] = true;

        while (!que.isEmpty()) {
            Node node = que.poll();
            if (node.x == maps.length - 1 && node.y == maps[0].length - 1)
                return node.dist;
            for (int i = 0; i < 4; i ++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < maps.length && ny < maps[0].length) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        que.offer(new Node(nx, ny, node.dist + 1));
                    }
                }
            }
        }
        return -1;
    }
}
