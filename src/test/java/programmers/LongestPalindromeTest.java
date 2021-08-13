package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

    LongestPalindrome l = new LongestPalindrome();

    @Test
    public void test1() {
        Assertions.assertEquals(7, l.solution("abcdcba"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(3, l.solution("abacde"));
    }
}
