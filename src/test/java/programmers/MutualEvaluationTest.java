package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MutualEvaluationTest {

    MutualEvaluation m = new MutualEvaluation();

    @Test
    public void test1() {
        String res = m.solution(new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}});
        Assertions.assertEquals("FBABD", res);
    }

    @Test
    public void test2() {
        String res = m.solution(new int[][]{{50, 90}, {50, 87}});
        Assertions.assertEquals("DA", res);
    }

    @Test
    public void test3() {
        String res = m.solution(new int[][]{{70, 49, 90}, {68, 50, 38}, {73, 31, 100}});
        Assertions.assertEquals("CFD", res);
    }
}
