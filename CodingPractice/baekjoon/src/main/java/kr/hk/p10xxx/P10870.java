package kr.hk.p10xxx;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/10870
* #수학 #구현 #재귀
* */
public class P10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int answer = 0;

        if(input == 0) answer = 0;
        else if(input == 1) answer = 1;
        else {
            int f1 = 1;
            int f2 = 1;
            for(int i = 2; i < input; i++) {
                int temp = f1+f2;
                f1 = f2;
                f2 = temp;
            }
            answer = f2;
        }
        System.out.println(answer);
    }
}
