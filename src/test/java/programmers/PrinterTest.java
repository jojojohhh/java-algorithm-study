package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrinterTest {
    @Test
    @DisplayName("PrinterTest1")
    public void test1() {
        Printer printer = new Printer();
        int result = printer.solution(new int[]{2, 1, 3, 2}, 2);
        Assertions.assertEquals(1, result);
    }

    @Test
    @DisplayName("PrinterTest2")
    public void test2() {
        Printer printer = new Printer();
        int result = printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        Assertions.assertEquals(5, result);
    }
}
