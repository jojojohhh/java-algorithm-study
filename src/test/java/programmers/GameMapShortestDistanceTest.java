package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameMapShortestDistanceTest {

    final GameMapShortestDistance game = new GameMapShortestDistance();

    @Test
    @DisplayName("GameMapShortestDistanceTest1")
    public void test1() {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};
        int result = game.solution(maps);
        Assertions.assertEquals(11, result);
    }

    @Test
    @DisplayName("GameMapShortestDistanceTest2")
    public void test2() {
        int[][] maps = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}};
        int result = game.solution(maps);
        Assertions.assertEquals(-1, result);
    }
}
