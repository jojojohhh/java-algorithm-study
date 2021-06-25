package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JoyStickTest {

    final JoyStick joyStick = new JoyStick();

    @Test
    @DisplayName("JoyStickTest1")
    public void test1() {
        int result = joyStick.solution("JAZ");
        Assertions.assertEquals(11, result);
    }

    @Test
    @DisplayName("JoyStickTest2")
    public void test2() {
        int result = joyStick.solution("JAN");
        Assertions.assertEquals(23, result);
    }

    @Test
    @DisplayName("JoyStickTest3")
    public void test3() {
        int result = joyStick.solution("JEROEN");
        Assertions.assertEquals(56, result);
    }
}
