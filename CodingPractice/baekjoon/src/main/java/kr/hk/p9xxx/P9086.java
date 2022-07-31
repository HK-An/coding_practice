package kr.hk.p9xxx;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/9086
* #구현 #문자열
* */
public class P9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < cases; i++) {
            String str = sc.nextLine();
            System.out.println(String.valueOf(str.toCharArray()[0]) + String.valueOf(str.toCharArray()[str.length()-1]));
        }
    }
}
