package programmers;

import java.util.Arrays;

public class ShuttleBus {
    public String solution(int n, int t, int m, String[] timetable) {
        int answer = 0;

        Arrays.sort(timetable);

        int arrivedTimeBus = 540;
        int idx = 0;
        while (n --> 0) {
            int accept = m;
            int lastBoardingTime = 0;
            while (idx < timetable.length) {
                int arrivedTimeCrew = Integer.parseInt(timetable[idx].substring(0, 2)) * 60 + Integer.parseInt(timetable[idx].substring(3));
                if (arrivedTimeCrew > arrivedTimeBus || accept == 0)    break;
                lastBoardingTime = arrivedTimeCrew;
                accept--;
                idx++;
            }
            if (n == 0) {
                if (accept > 0) answer = arrivedTimeBus;
                else    answer = lastBoardingTime - 1;
            } else {
                arrivedTimeBus += t;
                if (idx == timetable.length) {
                    answer = arrivedTimeBus + n * t;
                    break;
                }
            }
        }
        return String.format("%02d", answer / 60) + ":" + String.format("%02d", answer % 60);
    }

    public static void main(String[] args) {
        ShuttleBus shuttleBus = new ShuttleBus();
        System.out.println(shuttleBus.solution(10, 60, 45, new String[]{"23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
    }
}
