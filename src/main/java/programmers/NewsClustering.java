package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NewsClustering {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        List<String> twoGram1 = twoGram(str1);
        List<String> twoGram2 = twoGram(str2);

        int inter = 0;
        int uni = 0;

        Set<String> set = twoGram1.stream().collect(Collectors.toSet());
        for (String s : set) {
            if (twoGram2.stream().anyMatch(s::equals)) {
                int cnt1 = (int) twoGram1.stream().filter(s::equals).count();
                int cnt2 = (int) twoGram2.stream().filter(s::equals).count();
                inter += Math.min(cnt1, cnt2);
                uni += Math.max(cnt1, cnt2);
            } else {
                uni += twoGram1.stream().filter(s::equals).count();
            }
        }

        for (String s : twoGram2) {
            if(!twoGram1.stream().anyMatch(s::equals)) {
                uni++;
            }
        }

        if (uni == 0) {
            return 65536;
        } else {
            return (int) (((double) inter / (double) uni) * 65536);
        }
    }

    public static List<String> twoGram(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String s = (Character.toString(str.charAt(i)) + str.charAt(i + 1));
            if (s.matches("^[A-Z]*$")) {
                list.add(s);
            }
        }
        return list;
    }
}
