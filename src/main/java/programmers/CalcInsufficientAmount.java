package programmers;

public class CalcInsufficientAmount {
    public long solution(long price, long money, long count) {
        long sum = (price * count * (count + 1)) / 2;
        return money - sum < 0 ? sum - money : 0;
    }
}