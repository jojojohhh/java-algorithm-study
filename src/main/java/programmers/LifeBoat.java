package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Deque<Integer> q = new ArrayDeque<>();
        Arrays.sort(people);
        for (int n: people) q.offer(n);

        while (!q.isEmpty()) {
            if (q.size() > 1) {
                if (q.getFirst() + q.getLast() <= limit) {
                    q.pollFirst();
                }
                q.pollLast();
                answer++;
            } else {
                answer++;
                break;
            }
        }
        return answer;
    }
}
