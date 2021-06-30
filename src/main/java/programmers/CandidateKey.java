package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CandidateKey {

    public int solution(String[][] relation) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < (1 << relation[0].length); i++) {
            Set<String> set = new HashSet<>();

            for (int j = 0; j < relation.length; j++) {
                StringBuilder sb = new StringBuilder();

                for (int k = 0; k < relation[0].length; k++) {
                    if ((i & (1 << k)) > 0) {
                        sb.append(relation[j][k]);
                    }
                }
                set.add(sb.toString());
            }
            if (set.size() == relation.length && check(list, i)) {
                list.add(i);
            }
        }
        return list.size();
    }

    public static boolean check(ArrayList<Integer> ans, int i) {
        for (int j = 0; j < ans.size(); j++) {
            if ((ans.get(j) & i) == ans.get(j)) return false;
        }
        return true;
    }
}
