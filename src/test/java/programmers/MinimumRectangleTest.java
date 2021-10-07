package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumRectangleTest {

    MinimumRectangle m = new MinimumRectangle();

    @Test
    public void test1() {
        Assertions.assertEquals(4000, m.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(120, m.solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(133, m.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }
}
