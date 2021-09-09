package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LockAndKeyTest {

    LockAndKey lockAndKey = new LockAndKey();

    @Test
    public void test() {
        Assertions.assertEquals(true, lockAndKey.solution(new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}}, new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}));
    }
}
