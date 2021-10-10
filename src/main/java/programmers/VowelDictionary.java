package programmers;

import java.util.HashMap;

public class VowelDictionary {
    public int solution(String word) {
        int answer = 0;
        HashMap<Character, Integer> num = new HashMap<>();
        num.put('A', 0);
        num.put('E', 1);
        num.put('I', 2);
        num.put('O', 3);
        num.put('U', 4);

        int[] diff = {781, 156, 31, 6, 1};

        char[] w = word.toCharArray();
        for (int i = 0; i < w.length; i++)
            answer += num.get(w[i]) * diff[i] + 1;
        return answer;
    }
}