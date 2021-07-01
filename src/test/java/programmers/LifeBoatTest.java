package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LifeBoatTest {

    final LifeBoat lifeBoat = new LifeBoat();

    @Test
    @DisplayName("LifeBoatTest1")
    public void test1() {
        int result = lifeBoat.solution(new int[]{70, 50, 80, 50}, 100);
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("LifeBoatTest2")
    public void test2() {
        int result = lifeBoat.solution(new int[]{70, 80, 50}, 100);
        Assertions.assertEquals(3, result);
    }
}
