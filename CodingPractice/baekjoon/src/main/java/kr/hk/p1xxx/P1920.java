package kr.hk.p1xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P1920 {
    /*
    목표
    두번째 들어온 데이터들의 각 요소가 첫번째 들어온 데이터들 안에 있는지 확인하여 있으면 1을 없으면 0을 출력한다.

    아이디어
    1. 입력: 들어올 값의 개수(int N), N개의 데이터(int[] arr1), 들어올 값의 개수2(int M), M개의 데이터(int[] arr2)
    2. 탐색대상인 arr1만 정렬한다. (arr2를 정렬하면 순서가 바뀌어버리기도 하고 정렬할 필요가 없음)
    3. arr2에서 요소를 하나 획득하여 이진탐색한다.

    시간복잡도
    최대값: 1e5
    이진탐색: O(logN)
    예측: O(5*5) = 25
    */
    static long[] arr1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        arr1 = new long[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr1[i] = Long.parseLong(st.nextToken());
        } // 여기까지 N과 arr1 저장

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        long[] arr2 = new long[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            arr2[i] = Long.parseLong(st.nextToken());
        } // 여기까지 M과 arr2 저장

        Arrays.sort(arr1); // 여기까지 정렬
        List<Integer> list = new ArrayList<>();
        for(long target : arr2) { // arr2의 요소를 가져와 탐색
            int result = Arrays.binarySearch(arr1, target);
            int printResult = result < 0 ? 0 : 1;
            list.add(printResult);
        }

        for(int item : list) {
            System.out.println(item);
        }

    }
}
