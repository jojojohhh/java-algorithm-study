package programmers;

public class Stealing {
    public int solution(int[] money) {
        int[] dp1 = new int[money.length];
        int[] dp2 = new int[money.length];

        dp1[0] = money[0];
        dp1[1] = money[0];
        dp2[1] = money[1];

        for (int i = 2; i < dp1.length; i++) {
            dp1[i] = Math.max(dp1[i - 2] + money[i], dp1[i - 1]);
            dp2[i] = Math.max(dp2[i - 2] + money[i], dp2[i - 1]);
        }

        return Math.max(dp1[dp1.length - 2], dp2[dp2.length - 1]);
    }
}
