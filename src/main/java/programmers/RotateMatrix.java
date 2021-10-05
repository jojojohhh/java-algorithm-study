package programmers;

public class RotateMatrix {

    static int[][] board;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        board = new int[rows][columns];
        int cnt = 1;
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = cnt++;

        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotate(queries[i]);
        }
        return answer;
    }

    public static int rotate(int[] query) {
        int x1 = query[0] - 1, y1 = query[1] - 1, x2 = query[2] - 1, y2 = query[3] - 1;

        int tmp = board[x1][y2];
        int min = tmp;
        int idx = 0;
        int x = x1, y = y2;

        while(idx < 4) {
            int nx = x + dx[idx], ny = y + dy[idx];
            if (nx < x1 || ny < y1 || nx > x2 || ny > y2)   idx++;
            else {
                board[x][y] = board[nx][ny];
                min = Math.min(min, board[x][y]);
                x = nx;
                y = ny;
            }
        }

        board[x + 1][y] = tmp;
        return min;
    }
}
