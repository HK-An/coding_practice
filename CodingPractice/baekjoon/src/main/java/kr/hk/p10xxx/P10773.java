package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/10773
* #구현 #자료구조 #스택
* */
public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< N; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) stack.pop();
            else stack.push(num);
        }

        int sum = 0;
        for(int num : stack) {
            sum += num;
        }

        System.out.println(sum);
    }
}
