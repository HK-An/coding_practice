package kr.hk.p8xxx;

import java.util.Scanner;

public class P8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
