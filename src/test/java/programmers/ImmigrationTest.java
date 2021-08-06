package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImmigrationTest {

    @Test
    public void test() {
        Immigration immigration = new Immigration();
        long result = immigration.solution(6, new int[]{7, 10});
        Assertions.assertEquals(28, result);
    }
}
