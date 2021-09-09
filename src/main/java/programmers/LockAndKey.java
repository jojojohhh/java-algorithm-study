package programmers;

public class LockAndKey {
    public boolean solution(int[][] key, int[][] lock) {
        int startLockIdx = key.length - 1;
        int endLockIdx = startLockIdx + lock.length - 1;

        int lockCnt = 0;
        for (int i = 0; i < lock.length; i++) {
            for (int j = 0; j < lock.length; j++) {
                if (lock[i][j] == 0) lockCnt++;
            }
        }

        int[][] newLock = new int[startLockIdx * 2 + lock.length][startLockIdx * 2 + lock.length];

        for (int i = 0; i < lock.length; i++) {
            for (int j = 0; j < lock.length; j++) {
                newLock[startLockIdx + i][startLockIdx + j] = lock[i][j];
            }
        }

        int rotateCnt = 4;

        while (rotateCnt --> 0) {
            key = rotate(key);
            for (int i = 0; i <= endLockIdx; i++) {
                for (int j = 0; j <= endLockIdx; j++) {
                    boolean fail = false;
                    int cnt = 0;
                    for (int k = 0; k < key.length; k++) {
                        if (fail) break;
                        for (int l = 0; l < key.length; l++) {
                            if ((k + i >= startLockIdx && k + i <= endLockIdx) && (l + j >= startLockIdx && l + j <= endLockIdx)) {
                                if (key[k][l] == 1) {
                                    if (newLock[k + i][l + j] == 1) {
                                        fail = true;
                                        break;
                                    } else {
                                        cnt++;
                                    }
                                }
                            }
                        }
                    }
                    if (lockCnt == cnt) return true;
                }
            }
        }

        return false;
    }

    public int[][] rotate(int[][] key) {
        int[][] copyKey = new int[key.length][key.length];

        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length; j++) {
                copyKey[i][j] = key[key.length - 1 - j][i];
            }
        }
        return copyKey;
    }
}
