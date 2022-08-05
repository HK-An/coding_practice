package kr.hk.p9xxx;

import java.util.Scanner;
import java.util.Stack;

/*
* https://www.acmicpc.net/problem/9012
* #자료구조 #문자열 #스택
* */
public class P9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < N; i++) {
            String answer = "YES";
            String ps = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            for(char c : ps.toCharArray()) {
                if(c == '(') stack.push(c);
                else if(stack.size() == 0) {
                    answer = "NO";
                    break;
                }
                else if(stack.peek() == '(') stack.pop();
                else {
                    answer = "NO";
                    break;
                }
            }
            if(stack.size() != 0) answer = "NO";
            System.out.println(answer);
        }
    }
}
