package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateMatrixTest {
    RotateMatrix r = new RotateMatrix();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{8, 10, 25}, r.solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{1, 1, 5, 3}, r.solution(3, 3, new int[][]{{1, 1, 2, 2}, {1, 2, 2, 3}, {2, 1, 3, 2}, {2, 2, 3, 3}}));
    }

    @Test
    public void test3() {
        Assertions.assertArrayEquals(new int[]{1}, r.solution(100, 97, new int[][]{{1, 1, 100, 97}}));
    }
}
