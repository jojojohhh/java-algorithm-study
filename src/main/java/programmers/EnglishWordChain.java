package programmers;

import java.sql.SQLType;
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

    public static void main(String[] args) {
        EnglishWordChain englishWordChain = new EnglishWordChain();
        int[] n = englishWordChain.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        for (int a: n)  System.out.println(a);
//        System.out.println(englishWordChain.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
//        System.out.println(englishWordChain.solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));
//        System.out.println(englishWordChain.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
    }
}
