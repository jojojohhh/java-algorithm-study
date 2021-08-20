package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FillPuzzleTest {

    FillPuzzle f = new FillPuzzle();

    @Test
    public void test1() {
        Assertions.assertEquals(14, f.solution(new int[][]{{1, 1, 0, 0, 1, 0},
                        {0, 0, 1, 0, 1, 0},
                        {0, 1, 1, 0, 0, 1},
                        {1, 1, 0, 1, 1, 1},
                        {1, 0, 0, 0, 1, 0},
                        {0, 1, 1, 1, 0, 0}}
        , new int[][]{{1, 0, 0, 1, 1, 0},
                        {1, 0, 1, 0, 1, 0},
                        {0, 1, 1, 0, 1, 1},
                        {0, 0, 1, 0, 0, 0},
                        {1, 1, 0, 1, 1, 0},
                        {0, 1, 0, 0, 0, 0}}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(0, f.solution(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 1}}, new int[][]{{1, 1, 1}, {1, 0, 0}, {0, 0, 0}}));
    }
}
