package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class MaximizingFormulas {

    static Character[] priority;
    static ArrayList<Long> nums = new ArrayList<>();
    static ArrayList<Character> ops = new ArrayList<>();
    static Queue<String> ex = new LinkedList<>();
    static long answer = 0;

    public long solution(String expression) {
        String num = "";
        for (int i=0; i<expression.length(); i++) {
            if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                num += expression.charAt(i);
            } else {
                nums.add(Long.parseLong(num));
                num = "";
                ops.add(expression.charAt(i));
            }
        }

        nums.add(Long.parseLong(num));

        Set<Character> set = ops.stream().collect(Collectors.toSet());
        priority = new Character[set.size()];

        permutation(set.toArray(new Character[set.size()]), 0, new boolean[set.size()]);
        return answer;
    }

    public static void permutation(Character[] c, int depth, boolean[] visited) {
        if (c.length == depth) {
            cal(priority);
            return;
        }

        for (int i = 0; i < c.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                priority[depth] = c[i];
                permutation(c, depth + 1, visited);
                visited[i] = false;
            }
        }
    }

    public static void cal(Character[] p) {
        ArrayList<Long> newNums = new ArrayList<>(nums);
        ArrayList<Character> newOps = new ArrayList<>(ops);

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < newOps.size(); j++) {
                if (p[i] == newOps.get(j)) {
                    Long result = calc(newNums.remove(j), newNums.remove(j), p[i]);
                    newNums.add(j, result);
                    newOps.remove(j);
                    j--;
                }
            }
        }
        answer = Math.max(answer, Math.abs(newNums.get(0)));
    }

    public static Long calc(Long a, Long b, Character op) {
        Long result = 0L;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
        }
        return result;
    }
}