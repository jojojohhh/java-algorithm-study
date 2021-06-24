package programmers;

import java.util.*;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue que = new PriorityQueue(Collections.reverseOrder());

        for (int p : priorities) {
            que.offer(p);
        }

        while (!que.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == (int)que.peek()) {
                    if (i == location) {
                        return answer;
                    }
                    que.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
