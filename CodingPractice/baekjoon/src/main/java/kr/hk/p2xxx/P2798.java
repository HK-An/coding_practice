package kr.hk.p2xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2798 {
    /*
    아이디어
    1. 입력: 카드의개수(int N) 목표숫자(int M) 바닥에놓인카드(int[] cards)
    2. 배열을 3번 반복하여 순회하여 값을 찾는다.

    자료구조

    시간복잡도
    O(N^3) = O(100^3) = O(1e6)
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        // 여기까지 입력
        Arrays.sort(cards);

        int answer = 0;
        for(int i = 0; i < N-2; i++) {
            int sum = cards[i];

            for(int j = i+1; j < N-1; j++) {
                sum += cards[j];
                for(int q = j+1; q < N; q++) {
                    sum += cards[q];
                    if(sum > M) break;
                    if(sum <= M) {
                        answer = Math.max(answer, sum);
                    }
                    sum = cards[i] + cards[j];
                }
                sum = cards[i];
            }
            sum = 0;
        }
        System.out.println(answer);
    }
}
