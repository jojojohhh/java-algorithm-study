package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HighestLowestRankingLotteryTest {
    HighestLowestRankingLottery h = new HighestLowestRankingLottery();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{3, 5}, h.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{1, 6}, h.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}));
    }

    @Test
    public void test3() {
        Assertions.assertArrayEquals(new int[]{1, 1}, h.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}));
    }
}
