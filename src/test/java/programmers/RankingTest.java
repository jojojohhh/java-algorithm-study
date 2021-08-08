package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RankingTest {

    @Test
    public void test() {
        Ranking ranking = new Ranking();
        int result = ranking.solution(5, new int[][]{{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}});
        Assertions.assertEquals(2, result);
    }
}
