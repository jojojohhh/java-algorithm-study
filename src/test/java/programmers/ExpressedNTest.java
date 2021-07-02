package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExpressedNTest {

    final ExpressedN expressedN = new ExpressedN();

    @Test
    @DisplayName("ExpressedNTest1")
    public void test1() {
        int result = expressedN.solution(5, 5);
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("ExpressedNTest2")
    public void test2() {
        int result = expressedN.solution(5, 12);
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("ExpressedNTest3")
    public void test3() {
        int result = expressedN.solution(2, 11);
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("ExpressedNTest4")
    public void test4() {
        int result = expressedN.solution(5, 31168);
        Assertions.assertEquals(-1, result);
    }
}
