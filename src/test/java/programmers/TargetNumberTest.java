package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TargetNumberTest {

    @Test
    @DisplayName("TargetNumberTest")
    public void test() {
        TargetNumber targetNumber = new TargetNumber();
        int result = targetNumber.solution(new int[]{1, 1, 1, 1, 1}, 3);
        Assertions.assertEquals(5, result);
    }
}
