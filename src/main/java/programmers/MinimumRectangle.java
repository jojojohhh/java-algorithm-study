package programmers;

import java.util.Arrays;

public class MinimumRectangle {
    public int solution(int[][] sizes) {
        return Arrays.stream(sizes)
                .map(o -> Math.max(o[0], o[1]))
                .max((o1, o2) -> o1 - o2).get() *
                Arrays.stream(sizes)
                .map(o -> Math.min(o[0], o[1]))
                .max(((o1, o2) -> o1 - o2)).get();
    }
}
