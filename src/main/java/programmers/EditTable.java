package programmers;

import java.util.Stack;

public class EditTable {
    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < cmd.length; i++) {
            char command = cmd[i].charAt(0);
            if (command == 'U') {
                k -= Integer.parseInt(cmd[i].substring(2));
            } else if (command == 'D') {
                k += Integer.parseInt(cmd[i].substring(2));
            } else if (command == 'C') {
                st.push(k);
                if (--n == k)   k--;
            } else {
                int removed = st.pop();
                if (k >= removed) k++;
                n++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append('O');
        while (!st.isEmpty())   sb.insert(st.pop().intValue(), 'X');
        return sb.toString();
    }
}
