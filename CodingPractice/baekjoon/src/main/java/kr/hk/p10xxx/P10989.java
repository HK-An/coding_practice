package kr.hk.p10xxx;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 수 정렬하기 3
* https://www.acmicpc.net/problem/10989
* #정렬
*
* 시도
* 1. 정수배열에 값을 저장하고 그걸 Arrays.sort로 정렬했다 -> 시간초과
* 2. 기대시간복잡도가 조금더 낮은 Collections.sort로 정렬했다 -> 메모리초과
* 3. BufferedReader로 입력을 바꾸고 Arrays.sort로 정렬했다 -> 시간초과
* 4. BufferedWriter로 출력을 바꾸고 Arrays.sort로 정렬했다 -> 성공
*
* 배운점
* 입출력이 매우 많을경우에는 BufferedReader & BufferedWriter로 입출력을 수행하자.
* */
public class P10989 {
    /*
    아이디어
        1. 입력: 입력받을수의양(int N), 숫자(int number)
        2. 입력받아서 배열에 저장한다.
        3. 배열을 정렬한다.

    변수
    int N (1<=N<=1e7)
    int number (number<=1e4)
    int[] numberArr = new int[N]

    시간복잡도
    입력: O(1)
    정렬: 최악의경우 O(N^2)
    합: O(1e7^2 + 1) = O(1e14 + 1) < 3초
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] numberArr = new int[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            numberArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numberArr);
        for(int num : numberArr) {
            bw.append(num + "\n");
        }
        bw.flush();
        br.close();
    }
}
