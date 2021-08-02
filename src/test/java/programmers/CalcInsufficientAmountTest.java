package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcInsufficientAmountTest {

    @Test
    public void test() {
        CalcInsufficientAmount c = new CalcInsufficientAmount();

        long result = c.solution(2500, 1000000000, 2500);
        Assertions.assertEquals(6815625000L, result);

        result = c.solution(3, 20, 4);
        Assertions.assertEquals(10L, result);
    }
}
