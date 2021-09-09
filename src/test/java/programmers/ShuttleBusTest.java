package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuttleBusTest {
    ShuttleBus shuttleBus = new ShuttleBus();

    @Test
    public void test1() {
        Assertions.assertEquals("09:00", shuttleBus.solution(1, 1, 5, new String[]{"08:00", "08:01", "08:02", "08:03"}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("09:09", shuttleBus.solution(2, 10, 2, new String[]{"09:10", "09:09", "08:00"}));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("08:59", shuttleBus.solution(2, 1, 2, new String[]{"09:00", "09:00", "09:00", "09:00"}));
    }

    @Test
    public void test4() {
        Assertions.assertEquals("00:00", shuttleBus.solution(1, 1, 5, new String[]{"00:01", "00:01", "00:01", "00:01", "00:01"}));
    }

    @Test
    public void test5() {
        Assertions.assertEquals("09:00", shuttleBus.solution(1, 1, 1, new String[]{"23:59"}));
    }

    @Test
    public void test6() {
        Assertions.assertEquals("18:00", shuttleBus.solution(10, 60, 45, new String[]{"23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"}));
    }
}
