package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WayToSchoolTest {

    @Test
    @DisplayName("WayToSchoolTest")
    public void test() {
        WayToSchool wayToSchool = new WayToSchool();
        int result = wayToSchool.solution(4, 3, new int[][]{{2, 2}});
        Assertions.assertEquals(4, result);
    }
}
