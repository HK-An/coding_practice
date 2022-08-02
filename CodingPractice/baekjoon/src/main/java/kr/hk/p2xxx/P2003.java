package kr.hk.p2xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
* https://www.acmicpc.net/problem/2003
* #투포인터
*
* 재귀함수로 풀려다가 너무 복잡해져서 결국 투포인터에 대해 다시 찾아서 풀었다.
* 그런데 알고보니 문제도 이해를 잘못했다.
* 
* 투표인터에 대해 다시 정리하자면 startPoint와 endPoint를 조정해가며 연속된 데이터를 가지고 연산하는 방법이다.
* */

public class P2003 {
    static int[] numArr;
    static int N;
    static int answer = 0;
    static int expect;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        expect = Integer.parseInt(st.nextToken());
        numArr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        twoPointer();

        System.out.println(answer);
    }

    static void twoPointer() {
        int startPoint = 0;
        int endPoint = 0;
        int sum = 0;

        while(true) {
            if(sum >= expect) sum -= numArr[startPoint++];
            else if(endPoint == N) break;
            else sum += numArr[endPoint++];

            if(sum == expect) answer++;
        }
    }
}
