package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PyramidToothbrushSalesTest {

    PyramidToothbrushSales p = new PyramidToothbrushSales();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{360, 958, 108, 0, 450, 18, 180, 1080}, p.solution(new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"}, new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"}, new String[]{"young", "john", "tod", "emily", "mary"}, new int[]{12, 4, 2, 5, 10}));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{0, 110, 378, 180, 270, 450, 0, 0}, p.solution(new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"}, new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"}, new String[]{"sam", "emily", "jaimie", "edward"}, new int[]{2, 3, 5, 4}));
    }
}
