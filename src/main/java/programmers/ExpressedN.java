package programmers;

import java.util.*;

public class ExpressedN {

    static Set<Integer>[] dp = new HashSet[9];

    public int solution(int N, int number) {
        if (N == number)    return 1;

        String s = String.valueOf(N);
        for (int i = 0; i < 9; i++) {
            dp[i] = new HashSet<>();
            if (i == 1) dp[i].add(Integer.parseInt(s));
            else if (i > 1) {
                s += String.valueOf(N);
                dp[i].add(Integer.parseInt(s));
                for (int j = 0; j < i; j++) {
                    for (int num1: dp[j]) {
                        for (int num2: dp[i - j]) {
                            dp[i].add(num1 + num2);
                            dp[i].add(num1 - num2);
                            dp[i].add(num1 * num2);
                            if (num2 != 0)  dp[i].add(num1 / num2);
                            if (dp[i].contains(number)) return i;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
