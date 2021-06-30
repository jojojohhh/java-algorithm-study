package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EnglishWordChainTest {


    final EnglishWordChain englishWordChain = new EnglishWordChain();

    @Test
    @DisplayName("EnglishWordChainTest1")
    public void test1() {
        int[] result = englishWordChain.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        Assertions.assertArrayEquals(new int[]{3, 3}, result);
    }

    @Test
    @DisplayName("EnglishWordChainTest2")
    public void test2() {
        int[] result = englishWordChain.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        Assertions.assertArrayEquals(new int[]{0, 0}, result);
    }

    @Test
    @DisplayName("EnglishWordChainTest3")
    public void test3() {
        int[] result = englishWordChain.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        Assertions.assertArrayEquals(new int[]{1, 3}, result);
    }
}
