package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class TravelRoute {

    static boolean[] visited;
    static ArrayList<String> list;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        list = new ArrayList<>();
        dfs(tickets, "ICN", "ICN", 0);
        Collections.sort(list);
        return list.get(0).split(",");
    }

    public static void dfs(String[][] tickets, String str, String cur, int cnt) {
        if (cnt == tickets.length) {
            list.add(str);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(cur) && !visited[i]) {
                visited[i] = true;
                dfs(tickets, str + "," + tickets[i][1], tickets[i][1], cnt + 1);
                visited[i] = false;
            }
        }
    }
}
