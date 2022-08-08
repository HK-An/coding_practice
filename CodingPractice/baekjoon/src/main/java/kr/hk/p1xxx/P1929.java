package kr.hk.p1xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/1929
* #수학 #정수론 #소수 #에라토스테네스의체
* */

public class P1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] sieve = getSieve(N);

        StringBuilder s = new StringBuilder();
        for(int i = M; i <= N; i++) {
            if(sieve[i] == true) s.append(i + "\n");
        }

        System.out.println(s);
    }

    static boolean[] getSieve(int max) {
        boolean[] sieve = new boolean[max+1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for(int i = 2; i <= Math.sqrt(max)+1; i++) {
            if(sieve[i] == true) {
                for(int j = i * 2; j <= max; j+=i) {
                    sieve[j] = false;
                }
            }
        }

        return sieve;
    }
}
