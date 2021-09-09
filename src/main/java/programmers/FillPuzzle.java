package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class FillPuzzle {

    static int cnt;
    static ArrayList<int[]> list = new ArrayList<>();
    static int[][] newTable;

    public int solution(int[][] game_board, int[][] table) {
        int answer = -1;

        newTable = table;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == 1) {


                }
            }
        }

        return answer;
    }

    public void dfs(int x, int y) {
        cnt++;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
    }

    public static void main(String[] args) {
    }
}