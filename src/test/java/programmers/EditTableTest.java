package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EditTableTest {

    EditTable e = new EditTable();

    @Test
    public void test1() {
        String res = e.solution(8, 2, new String[]{"D 2","C","U 3","C","D 4","C","U 2","Z","Z"});
        Assertions.assertEquals("OOOOXOOO", res);
    }

    @Test
    public void test2() {
        String res = e.solution(8, 2, new String[]{"D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"});
        Assertions.assertEquals("OOXOXOOO", res);
    }
}
