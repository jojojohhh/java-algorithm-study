package programmers;

import java.util.HashSet;
import java.util.Set;

public class EnglishWordChain {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        char before =words[0].charAt(0);
        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i]) || before != words[i].charAt(0)) {
                return new int[]{(i + 1) % n == 0 ? n : (i + 1) % n, (i + 1) % n == 0 ? (i + 1) / n : (i + 1) / n + 1};
            }
            set.add(words[i]);
            before = words[i].charAt(words[i].length() - 1);
        }
        return new int[]{0, 0};
    }
}
