package baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int N = arr[0];
        int K = arr[1];

        int[] coin = new int[N];

        for (int i = 0; i < N; i++)
            coin[i] = Integer.parseInt(br.readLine());

        int sol = 0;

        N--;
        while (K > 0) {
            while (coin[N] > K) N--;

            int cnt = K / coin[N];

            K -= cnt * coin[N];
            sol += cnt;

            if (K == 0) break;
        }
        System.out.println(sol);
    }
}
