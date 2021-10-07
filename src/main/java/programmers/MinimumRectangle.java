package programmers;

import java.util.Arrays;

public class MinimumRectangle {
    public int solution(int[][] sizes) {
        int width = 0, height = 0;
        for (int[] size: sizes) {
            Arrays.sort(size);
            width = Math.max(width, size[0]);
            height = Math.max(height, size[1]);
        }
        return width * height;
    }
}
