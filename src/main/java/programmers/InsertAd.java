package programmers;

public class InsertAd {
    public String solution(String play_time, String adv_time, String[] logs) {
        int playTime = timeToSecond(play_time);
        int advTime = timeToSecond(adv_time);

        long[] play = new long[playTime + 1];
        for (String log : logs) {
            String[] time = log.split("-");
            play[timeToSecond(time[0])]++;
            play[timeToSecond(time[1])]--;
        }

        for (int i = 1; i <= playTime; i++) play[i] += play[i - 1];
        for (int i = 1; i <= playTime; i++) play[i] += play[i - 1];

        long max = play[advTime - 1];
        long maxStart = 0;
        for (int i = advTime; i < play.length; i++) {
            long tmp = play[i] - play[i -advTime];
            if (max < tmp) {
                max = tmp;
                maxStart = i - advTime + 1;
            }
        }

        return String.format("%02d:%02d:%02d", maxStart / 3600, (maxStart / 60) % 60, maxStart % 60);
    }

    public int timeToSecond(String time) {
        return Integer.parseInt(time.substring(0, 2)) * 3600 + Integer.parseInt(time.substring(3, 5)) * 60 + Integer.parseInt(time.substring(6, 8));
    }
}
