package programmers;

import java.util.Arrays;

public class WordConversion {

    static boolean[] visited;
    static int answer = 51;

    public int solution(String begin, String target, String[] words) {
        if (!Arrays.stream(words).anyMatch(target::equals)) return 0;
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int change) {
        if (begin.equals(target)){
            answer = Math.min(answer, change);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isChange(begin, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, change + 1);
                visited[i] = false;
            }
        }

    }

    public static boolean isChange(String cur, String nxt) {
        int cnt = 0;
        for (int i = 0; i < cur.length(); i++)
            if (cur.charAt(i) != nxt.charAt(i))
                cnt++;
        return cnt == 1 ? true : false;
    }
}
