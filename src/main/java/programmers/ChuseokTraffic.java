package programmers;

public class ChuseokTraffic {
    public int solution(String[] lines) {
        int answer = 0;
        int[][] t = new int[lines.length][2];
        for (int i = 0; i < lines.length; i++) {    // 시간 계산 고쳐야함
            String[] temp = lines[i].split("\\s");
            t[i][1] = (int) (Double.parseDouble(temp[1].replaceAll(":", "")) * 1000);
            t[i][0] = t[i][1] - (int) (Double.parseDouble(temp[2].substring(0, temp[2].length() - 1)) * 1000) + 1;
        }

        for (int i = 0; i < t.length; i++) {
            int[] start = {t[i][0], t[i][0] + 999};
            int[] end = {t[i][1], t[i][1] + 999};
            int startCnt = 0;
            int endCnt = 0;
            for (int j = 0; j < t.length; j++) {
                if ((t[j][0] >= start[0] && t[j][0] <= start[1]) || (t[j][1] >= start[0] && t[j][1] <= start[1]) || (t[j][0] <= start[0] && t[j][1] >= start[1]))   startCnt++;
                if ((t[j][0] >= end[0] && t[j][0] <= end[1]) || (t[j][1] >= end[0] && t[j][1] <= end[1]) || (t[j][0] <= end[0] && t[j][1] >= end[1]))   endCnt++;
            }
            answer = Math.max(Math.max(startCnt, endCnt), answer);
        }

        return answer;
    }
}
