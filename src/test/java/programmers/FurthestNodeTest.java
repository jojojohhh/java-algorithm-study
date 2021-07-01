package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FurthestNodeTest {

    final FurthestNode furthestNode = new FurthestNode();

    @Test
    @DisplayName("FurthestNodeTest")
    public void test() {
        int result = furthestNode.solution(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}});
        Assertions.assertEquals(3, result);
    }
}
