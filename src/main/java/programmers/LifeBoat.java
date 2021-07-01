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

    public static void main(String[] args) {
        LifeBoat lifeBoat = new LifeBoat();
//        System.out.println(lifeBoat.solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(lifeBoat.solution(new int[]{70, 80, 50}, 100));
    }
}
