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

//    public boolean solution(int[][] key, int[][] lock) {
//        int[][] newLock = new int[(key.length - 1) * 2 + lock.length][(key.length - 1) * 2 + lock.length];
//        HashSet<String> set = new HashSet<>();
//
//        for (int i = 0; i < lock.length; i++) {
//            for (int j = 0; j < lock.length; j++) {
//                newLock[key.length - 1 + i][key.length - 1 + j] = lock[i][j];
//                if (lock[i][j] == 0) {
//                    set.add(String.valueOf(key.length - 1 + i) + String.valueOf(key.length - 1 + j));
//                }
//            }
//        }
//
//        int startLockIdx = key.length - 1;
//        int endLockIdx = startLockIdx + lock.length - 1;
//
//        int rotateCnt = 3;
//
//        while (rotateCnt --> 0) {
//            for (int i = 0; i <= newLock.length - key.length; i++) {
//                for (int j = 0; j <= newLock.length - key.length; j++) {
//                    HashSet<String> newSet = new HashSet<>(set);
//                    boolean fail = false;
//                    for (int k = 0; k < key.length; k++) {
//                        if (fail) break;
//                        for (int l = 0; l < key.length; l++) {
//                            if ((k + i >= startLockIdx && k + i <= endLockIdx) && (l + j >= startLockIdx && l + j <= endLockIdx)) {
//                                String val = String.valueOf(k + i) + String.valueOf(l + j);
//                                if (key[k][l] == 1) {
//                                    if (newSet.contains(val)) {
//                                        newSet.remove(val);
//                                    } else {
//                                        fail = true;
//                                        break;
//                                    }
//                                }
//                            }
//                        }
//                    }
//                    if (newSet.size() == 0) return true;
//                }
//            }
//            key = rotate(key);
//        }
//
//        return false;
//    }
//
//    public int[][] rotate(int[][] key) {
//        int[][] copyKey = new int[key.length][key.length];
//
//        for (int i = 0; i < key.length; i++) {
//            for (int j = 0; j < key.length; j++) {
//                copyKey[i][j] = key[key.length - 1 - j][i];
//            }
//        }
//        return copyKey;
//    }