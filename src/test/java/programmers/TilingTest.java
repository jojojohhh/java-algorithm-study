package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TilingTest {

    Tiling t = new Tiling();

    @Test
    public void test() {
        Assertions.assertEquals(5, t.solution(4));
    }
}
