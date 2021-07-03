package programmers;

import java.util.Arrays;

public class IntegerTriangle {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            dp[i][0] = dp[i - 1][0] + triangle[i][0];

            for (int j = 1; j < i + 1; j++)
                dp[i][j] = triangle[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
        }

        int[] max = Arrays.copyOf(dp[dp.length - 1], dp[dp.length - 1].length);
        Arrays.sort(max);
        return max[max.length - 1];
    }
}
