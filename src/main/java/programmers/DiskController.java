package programmers;

import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;
        int cnt = 0;
        int cur = 0;

        PriorityQueue<int[]> que = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> waitQue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        for (int[] job : jobs)  que.add(new int[]{job[0], job[1]});

        while (cnt < jobs.length) {
            while (!que.isEmpty() && que.peek()[0] <= cur)
                waitQue.add(que.poll());
            if (waitQue.isEmpty()) {
                cur = que.peek()[0];
            } else {
                int[] temp = waitQue.poll();
                cur += temp[1];
                answer += cur - temp[0];
                cnt++;
            }
        }

        return answer / jobs.length;
    }

    public static void main(String[] args) {
        DiskController d = new DiskController();
        System.out.println(d.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }
}
