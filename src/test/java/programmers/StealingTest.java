package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StealingTest {

    Stealing stealing = new Stealing();

    @Test
    @DisplayName("StealingTest1")
    public void test1() {
        int result = stealing.solution(new int[]{1, 2, 3, 1});
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("StealingTest2")
    public void test2() {
        int result = stealing.solution(new int[]{5, 3, 2, 7, 1, 3});
        Assertions.assertEquals(13, result);
    }
}
