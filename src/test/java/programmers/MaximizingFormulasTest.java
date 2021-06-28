package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximizingFormulasTest {

    @Test
    @DisplayName("MaximizingFormulasTest1")
    public void test1() {
        MaximizingFormulas maximizingFormulas = new MaximizingFormulas();
        Long result = maximizingFormulas.solution("100-200*300-500+20");
        Assertions.assertEquals(60420, result);
    }

    @Test
    @DisplayName("MaximizingFormulasTest2")
    public void test2() {
        MaximizingFormulas maximizingFormulas = new MaximizingFormulas();
        Long result = maximizingFormulas.solution("50*6-3*2");
        Assertions.assertEquals(300, result);
    }
}
