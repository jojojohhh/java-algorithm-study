package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class HighestLowestRankingLottery {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set set = Arrays.stream(win_nums).boxed().collect(Collectors.toSet());
        int cnt = 0;
        int zero = 0;
        for(int lotto: lottos) {
            if (lotto == 0)
                zero++;
            else if (set.contains(lotto))
                cnt++;
        }
        return new int[]{Math.min(lottos.length - (zero + cnt) + 1, 6), Math.min(lottos.length - cnt + 1, 6)};
    }
}
