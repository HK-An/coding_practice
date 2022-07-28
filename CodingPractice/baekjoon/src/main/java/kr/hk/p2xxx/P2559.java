package kr.hk.p2xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] temps = new int[N];
        int sum = 0;
        int max = 0;

        for(int i = 0; i < N; i++) {
            temps[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < K; i++) {
            sum += temps[i];
        }
        max = sum;

        for(int i = K; i < N; i++) {
            sum += temps[i];
            sum -= temps[i-K];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
