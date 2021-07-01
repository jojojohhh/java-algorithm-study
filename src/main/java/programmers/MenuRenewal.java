package programmers;

import java.util.*;

public class MenuRenewal {

    static int max;

    public String[] solution(String[] orders, int[] courses) {
        Map<String, Integer> map = new HashMap<>();
        Queue<String> q = new PriorityQueue<>();

        for (int course: courses) {
            max = 0;
            for (String order: orders) {
                map = select(order, course, map);
            }
            for (String key: map.keySet()) {
                if (map.get(key) == max && max > 1) {
                    q.offer(key);
                }
            }
            map.clear();
        }
        String[] answer = new String[q.size()];
        int i = 0;
        while (!q.isEmpty())  answer[i++] = q.poll();
        return answer;
    }

    public static Map<String, Integer> select(String order, int course, Map<String, Integer> map) {
        for (int i = 0; i < (1 << order.length()); i++) {
            int bitCnt = Integer.bitCount(i);
            if (bitCnt == course) {
                String bitStr = Integer.toBinaryString(i);
                bitStr = bitReverse(bitStr, order.length());
                String temp = "";
                for (int j = 0; j < bitStr.length(); j++) {
                    if (bitStr.charAt(j) == '1') {
                        temp += order.charAt(j);
                    }
                }
                char[] ch = temp.toCharArray();
                Arrays.sort(ch);
                temp = "";
                for (char c: ch)    temp += c;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
                max = Math.max(max, map.get(temp));
            }
        }
        return map;
    }

    public static String bitReverse(String bitStr, int length) {
        while (bitStr.length() != length)   bitStr = "0" + bitStr;
        StringBuffer sb = new StringBuffer(bitStr);
        return sb.reverse().toString();
    }
}
