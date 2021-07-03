package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerTriangleTest {

    @Test
    @DisplayName("IntegerTriangleTest")
    public void test() {
        IntegerTriangle integerTriangle = new IntegerTriangle();
        int result = integerTriangle.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}});
        Assertions.assertEquals(30, result);
    }
}
