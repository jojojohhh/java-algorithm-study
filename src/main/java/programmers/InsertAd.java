package programmers;

import java.util.Arrays;

public class InsertAd {
    public String solution(String play_time, String adv_time, String[] logs) {

        if (play_time.equals(adv_time)) return "00:00:00";

        Arrays.sort(logs);

        int[][] secLogs = new int[logs.length][2];
        int adTime = Integer.parseInt(adv_time.substring(0, 2)) * 3600 + Integer.parseInt(adv_time.substring(3, 5)) * 60 + Integer.parseInt(adv_time.substring(6, 8));

        for (int i = 0; i < logs.length; i++) {
            String[] log = logs[i].split("-");
            secLogs[i][0] = Integer.parseInt(log[0].substring(0, 2)) * 3600 + Integer.parseInt(log[0].substring(3, 5)) * 60 + Integer.parseInt(log[0].substring(6, 8));
            secLogs[i][1] = Integer.parseInt(log[1].substring(0, 2)) * 3600 + Integer.parseInt(log[1].substring(3, 5)) * 60 + Integer.parseInt(log[1].substring(6, 8));
        }

        int idx = 0;
        int max = 0;

        for (int i = 0; i < logs.length; i++) {
            int start = secLogs[i][0];
            int end = start + adTime;
            int sum = end - start;
            for (int j = 0; j < logs.length; j++) {
                if (i == j) continue;
                if (i < j) {
                    if (end > secLogs[j][0]) {
                        if (end <= secLogs[j][1])
                            sum += end - secLogs[j][0];
                        else
                            sum += secLogs[j][1] - secLogs[j][0];
                    } else  break;
                } else {
                    if (start < secLogs[j][1]) {
                        if (end >= secLogs[j][1])
                            sum += secLogs[j][1] - start;
                        else
                            sum += adTime;
                    }
                }
            }
            if (max < sum) {
                max = sum;
                idx = i;
            }
        }
        return logs[idx].split("-")[0];
    }
//
//    public static void main(String[] args) {
//        InsertAd insertAd = new InsertAd();
//        insertAd.solution("02:03:55", "00:14:15", new String[]{"01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"});
//    }
}
