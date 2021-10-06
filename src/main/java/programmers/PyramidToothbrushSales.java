package programmers;

import java.util.HashMap;

public class PyramidToothbrushSales {

    static HashMap<String, String> relation = new HashMap<>();
    static HashMap<String, Integer> enrollIdx = new HashMap<>();
    static int[] answer;

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++){
            relation.put(enroll[i], referral[i]);
            enrollIdx.put(enroll[i], i);
        }

        for (int i = 0; i < seller.length; i++) {
            recursion(seller[i], amount[i] * 100, enrollIdx.get(seller[i]));
        }
        return answer;
    }

    public static void recursion(String seller, int price, int index) {
        int remainder = (int) (price * 0.1);
        answer[index] += price - remainder;
        if (!relation.get(seller).equals("-")) {
            if (remainder >= 1)
                recursion(relation.get(seller), remainder, enrollIdx.get(relation.get(seller)));
        }
    }
}
