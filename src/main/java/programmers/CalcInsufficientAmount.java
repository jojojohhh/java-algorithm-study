package programmers;

public class CalcInsufficientAmount {
    public long solution(int price, int money, int count) {
        Long sum = count % 2 == 0 ? (long) (((count + 1) * (count / 2))) * price : (long) ((count / 2) * ((count + 1) + 1) + 1) * price;
        return money - sum < 0 ? sum - money : 0;
    }
    public static void main(String[] args) {
        CalcInsufficientAmount c = new CalcInsufficientAmount();
        System.out.println(c.solution(2500, 1000000000, 2500));
        System.out.println(c.solution(3, 20, 4));
//        long sum = 0L;
//        for (int i = 1; i <= 2500; i++) sum += 2500 * i;
//        System.out.println(sum);
//
//        int a = 1000000000;
//        System.out.println(a);
//
//        System.out.println(a < sum);
    }
}