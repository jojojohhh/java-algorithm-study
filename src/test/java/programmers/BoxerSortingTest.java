package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoxerSortingTest {

    BoxerSorting b = new BoxerSorting();

    @Test
    public void test1(){
        Assertions.assertArrayEquals(new int[]{3, 4, 1, 2}, b.solution(new int[]{50, 82, 75, 120}, new String[]{"NLWL", "WNLL", "LWNW", "WWLN"}));
    }

    @Test
    public void test2(){
        Assertions.assertArrayEquals(new int[]{2, 3, 1}, b.solution(new int[]{145, 92, 86}, new String[]{"NLW", "WNL", "LWN"}));
    }

    @Test
    public void test3(){
        Assertions.assertArrayEquals(new int[]{2, 1, 3}, b.solution(new int[]{60, 70, 60}, new String[]{"NNN", "NNN", "NNN"}));
    }
}
