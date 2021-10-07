package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DividePowerGridTest {

    DividePowerGrid d = new DividePowerGrid();

    @Test
    public void test1() {
        Assertions.assertEquals(3, d.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(0, d.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(1, d.solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}}));
    }
}
