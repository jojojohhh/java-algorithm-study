package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnteringCheckOutTest {

    EnteringCheckOut e = new EnteringCheckOut();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{0, 1, 1}, e.solution(new int[]{1, 3, 2}, new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{1, 4, 2, 3}, e.solution(new int[]{2, 1, 3, 4}, new int[]{2, 2, 1, 3}));
    }

    @Test
    public void test3() {
        Assertions.assertArrayEquals(new int[]{3, 2, 1}, e.solution(new int[]{2, 1, 3}, new int[]{1, 1, 2}));
    }

    @Test
    public void test4() {
        Assertions.assertArrayEquals(new int[]{3, 2, 1}, e.solution(new int[]{1, 3, 2}, new int[]{2, 2, 2}));
    }

    @Test
    public void test5() {
        Assertions.assertArrayEquals(new int[]{1, 4, 2, 3}, e.solution(new int[]{2, 1, 4, 3}, new int[]{2, 2, 0, 2}));
    }
}
