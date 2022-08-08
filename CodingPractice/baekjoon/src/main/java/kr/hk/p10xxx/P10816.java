package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* https://www.acmicpc.net/problem/10816
* #자료구조 #정렬 #이분탐색 #해시

* */
public class P10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if(map.containsKey(value)) map.put(value, map.get(value)+1);
            else map.put(value, 1);
        }

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        List<Integer> questions = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            questions.add(Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();

        for(int question : questions) {
            sb.append(map.getOrDefault(question, 0) + " ");
        }

        sb.deleteCharAt(sb.length() -1);
        System.out.println(sb);
    }
}
