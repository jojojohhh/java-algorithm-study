package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MenuRenewalTest {

    final MenuRenewal menuRenewal = new MenuRenewal();

    @Test
    @DisplayName("MenuRenewalTest1")
    public void test1() {
        String[] result = menuRenewal.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4});
        Assertions.assertArrayEquals(new String[]{"AC", "ACDE", "BCFG", "CDE"}, result);
    }

    @Test
    @DisplayName("MenuRenewalTest2")
    public void test2() {
        String[] result = menuRenewal.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5});
        Assertions.assertArrayEquals(new String[]{"ACD", "AD", "ADE", "CD", "XYZ"}, result);
    }

    @Test
    @DisplayName("MenuRenewalTest3")
    public void test3() {
        String[] result = menuRenewal.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4});
        Assertions.assertArrayEquals(new String[]{"WX", "XY"}, result);
    }
}
