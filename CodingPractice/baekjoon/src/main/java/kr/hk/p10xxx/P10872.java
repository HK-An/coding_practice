package kr.hk.p10xxx;

import java.util.Scanner;

public class P10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer;
        if (num == 0) answer = 1;
        else {
            answer = 1;
            for(int i = num; i > 0; i--) {
                answer *= i;
            }
        }

        System.out.println(answer);
    }
}
