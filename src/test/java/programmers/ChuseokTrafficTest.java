package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChuseokTrafficTest {

    ChuseokTraffic chuseokTraffic = new ChuseokTraffic();

    @Test
    public void test1() {
        int result = chuseokTraffic.solution(new String[]{"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"});
        Assertions.assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = chuseokTraffic.solution(new String[]{"2016-09-15 23:59:59.999 0.001s"});
        Assertions.assertEquals(1, result);
    }

    @Test
    public void test3() {
        int result = chuseokTraffic.solution(new String[]{"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"});
        Assertions.assertEquals(1, result);
    }

    @Test
    public void test4() {
        int result = chuseokTraffic.solution(new String[]{"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"});
        Assertions.assertEquals(2, result);
    }

    @Test
    public void test5() {
        int result = chuseokTraffic.solution(new String[]{"2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s", "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s"});
        Assertions.assertEquals(7, result);
    }

    @Test
    public void test6() {
        int result = chuseokTraffic.solution(new String[]{"2016-09-15 00:00:00.000 2.3s", "2016-09-15 23:59:59.999 0.1s"});
        Assertions.assertEquals(1, result);
    }

}
