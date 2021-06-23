package programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SpicierTest {

    @Test
    @DisplayName("SpicierTest")
    public void test() {
        Spicier spicier = new Spicier();
        int result = spicier.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println(result);
        Assertions.assertEquals(2, result);
    }
}
