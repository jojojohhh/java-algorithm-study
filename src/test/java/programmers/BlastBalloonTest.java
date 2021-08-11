package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlastBalloonTest {
    BlastBalloon b = new BlastBalloon();

    @Test
    public void test1() {
        Assertions.assertEquals(3, b.solution(new int[]{9, -1, -5}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(6, b.solution(new int[]{-16, 27, 65, -2, 58, -92, -71, -68, -61, -33}));
    }

}
