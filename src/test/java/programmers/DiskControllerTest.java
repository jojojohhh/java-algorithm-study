package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiskControllerTest {
    @Test
    @DisplayName("DiskControllerTest")
    public void test() {
        DiskController diskController = new DiskController();
        int result = diskController.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
        Assertions.assertEquals(9, result);

    }
}
