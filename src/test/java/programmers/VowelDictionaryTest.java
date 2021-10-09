package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelDictionaryTest {

    VowelDictionary v = new VowelDictionary();

    @Test
    public void test1() {
        Assertions.assertEquals(6, v.solution("AAAAE"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(10, v.solution("AAAE"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(1563, v.solution("I"));
    }

    @Test
    public void test4() {
        Assertions.assertEquals(1189, v.solution("EIO"));
    }
}
