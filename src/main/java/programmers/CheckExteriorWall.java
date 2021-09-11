package programmers;

public class CheckExteriorWall {
    public int solution(int n, int[] weak, int[] dist) {
        int answer = 0;

        int[] newWeak = new int[weak.length * 2 - 1];
        for (int i = 0; i < newWeak.length; i++) {
            if (i / weak.length == 0) newWeak[i] =  weak[i];
            else newWeak[i] = weak[i % weak.length] + n;
        }

        for (int i = 0; i < weak.length; i++) {
            int idx = dist.length - 1;
            for (int j = i + 1; j < weak.length + i; j++) {
                if (newWeak[j] - newWeak[i] < dist[idx]) {

                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CheckExteriorWall checkExteriorWall = new CheckExteriorWall();
        checkExteriorWall.solution(12, new int[]{1, 5, 6, 10}, new int[]{1, 2, 3, 4});
    }
}
