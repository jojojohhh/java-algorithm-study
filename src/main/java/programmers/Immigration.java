package programmers;

import java.util.Arrays;

public class Immigration {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 0;
        long end = (long) Arrays.stream(times).max().getAsInt() * (long) n;

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;
            for (int time : times)
                sum += mid / time;
            if (sum < n) {
                start = mid + 1;
            } else {
                answer = mid;
                end = mid - 1;
            }
        }
        return answer;
    }
}
