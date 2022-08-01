package kr.hk.p2xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/2751
* #정렬
*
* 시도
* 1. 뻔한 문제는 낼리 없다고 생각은했지만 가장 간단한 방법 Arrays.sort() => 시간초과
* dual-pviot 평균 O(nlogn) 최악 O(N^2)
* 2. 어디서 Collection을 사용한 정렬은 빠르다고 했던것이 기억나 List.sort() => 시간초과
* 3. 찾아보니 Collection.sort(list)였다. 각 반복마다 sout찍었더니 시간초과
* 4. 출력을 stringbuilder로 바꿔서 해결
* */
public class P2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int num : list) {
            sb.append(num + "\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
