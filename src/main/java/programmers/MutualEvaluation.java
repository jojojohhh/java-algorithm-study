package programmers;

import java.util.Arrays;

public class MutualEvaluation {
    public String solution(int[][] scores) {
        String answer = "";
        int[][] newScores = new int[scores.length][scores.length];
        int[] max = new int[scores.length];
        int[] min = new int[scores.length];
        Arrays.fill(min, Integer.MAX_VALUE);

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                newScores[i][j] = scores[j][i];
                max[i] = Math.max(max[i], newScores[i][j]);
                min[i] = Math.min(min[i], newScores[i][j]);
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int m = Integer.MAX_VALUE;

            if (newScores[i][i] == max[i]) {
                m = max[i];
            } else if (newScores[i][i] == min[i]) {
                m = min[i];
            }

            int val1 = m;
            if (Arrays.stream(newScores[i]).filter(o -> o == val1).count() != 1) m = Integer.MAX_VALUE;

            int val2 = m;
            double avg = Arrays.stream(newScores[i]).filter(o -> o != val2).average().getAsDouble();

            answer += avg >= 90 ? "A" : avg >= 80 ? "B" : avg >= 70 ? "C" : avg >= 50 ? "D" : "F";
        }
        return answer;
    }
}

class AnotherSolution {
    public String solution(int[][] scores) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<scores.length; i++) {
            int max = 0;
            int min = 101;
            int sum = 0;
            int divide = scores.length;
            for(int j=0; j<scores.length; j++) {
                int score = scores[j][i];
                if(i != j) {
                    if(score < min) {
                        min = score;
                    }
                    if(score > max) {
                        max = score;
                    }
                }
                sum += score;
            }
            if(scores[i][i] < min || scores[i][i] > max) {
                sum -= scores[i][i];
                divide--;
            }
            double score = (double) sum / divide;
            builder.append(score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 50 ? "D" : "F" );
        }
        return builder.toString();
    }
}