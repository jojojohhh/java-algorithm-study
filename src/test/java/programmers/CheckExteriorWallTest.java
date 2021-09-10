package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckExteriorWallTest {

    CheckExteriorWall checkExteriorWall = new CheckExteriorWall();

    @Test
    public void test1() {
        Assertions.assertEquals(2, checkExteriorWall.solution(12, new int[]{1, 5, 6, 10}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, checkExteriorWall.solution(12, new int[]{1, 3, 4, 9, 10}, new int[]{3, 5, 7}));
    }
}
