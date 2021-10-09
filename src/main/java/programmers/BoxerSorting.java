package programmers;

import java.util.ArrayList;
import java.util.Comparator;

public class BoxerSorting {
    public class Boxer {
        int index;
        int weight;
        int winCount = 0;
        int gameCount = 0;
        int over = 0;
        double winRate;

        Boxer(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }

        public void addOver() {
            this.over++;
        }

        public void addWinCount() {
            this.winCount++;
        }

        public void addGameCount() {
            this.gameCount++;
        }

        public double getWinRate() {
            return winRate;
        }

        public int getOver() {
            return over;
        }

        public int getWeight() {
            return weight;
        }

        public int getIndex() {
            return index;
        }

        public void setWinRate() {
            this.winRate = gameCount > 0 ? ((1.0 * winCount / gameCount) * 10000) : 0;
        }
    }

    public int[] solution(int[] weights, String[] head2head) {
        ArrayList<Boxer> boxers = new ArrayList<>();
        for (int i = 0; i < weights.length; i++)
            boxers.add(new Boxer(i + 1, weights[i]));
        for (int i = 0; i < head2head.length; i++) {
            for (int j = 0; j < head2head[i].length(); j++) {
                if (head2head[i].charAt(j) != 'N') {
                    boxers.get(i).addGameCount();
                    if (head2head[i].charAt(j) == 'W')  {
                        boxers.get(i).addWinCount();
                        if (boxers.get(i).weight < boxers.get(j).weight)    boxers.get(i).addOver();
                    }
                }
            }
            boxers.get(i).setWinRate();
        }
        return boxers.stream().sorted(
                Comparator.comparing(Boxer::getWinRate)
                        .thenComparing(Boxer::getOver)
                        .thenComparing(Boxer::getWeight)
                        .thenComparing((o1, o2) -> o2.index - o1.index)
                        .reversed())
                .mapToInt(Boxer::getIndex).toArray();
    }
}