package kr.hk.p11xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047 {
    /*
    아이디어
    1. 입력: 동전의종류수(int N), 목표금액(int target), 동전의가치(int[] values)
    2. values의 마지막부터 item을 꺼내 나누어본다.
    3. target / item > 0 ? target = target % item : doNothing
    4. target == 0 ? exit : 2번이동

    자료구조
    동전의종류: 1 ≤ N ≤ 10    => int
    목표금액: 1 ≤ K ≤ 100,000,000(1E8)    => int
    동전의가치: 1 ≤ Ai ≤ 1,000,000(1E6)    => int

    시간복잡도

    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] values = new int[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            values[i] = Integer.parseInt(st.nextToken());
        }

        // 여기까지 입력

        int answer = 0;
        for(int i = N-1; i >= 0; i--) {
            int value = values[i];
            int share = target / value;

            if(share > 0) {
                target = target % value;
                answer+= share;
            }
            if(target == 0) break;
        }

        System.out.println(answer);
    }
}
