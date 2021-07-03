package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NetworkTest {

    Network network = new Network();

    @Test
    @DisplayName("NetworkTest1")
    public void test1() {
        int result = network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("NetworkTest2")
    public void test2() {
        int result = network.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}});
        Assertions.assertEquals(1, result);
    }

}
