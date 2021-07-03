package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordConversionTest {

    WordConversion wordConversion = new WordConversion();

    @Test
    public void test1() {
        int result = wordConversion.solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log", "cog"});
        Assertions.assertEquals(4, result);
    }

    @Test
    public void test2() {
        int result = wordConversion.solution("hit", "cog", new String[] {"hot", "dot", "dog", "lot", "log"});
        Assertions.assertEquals(0, result);
    }
}
