package kr.hk.stage.one;

import java.util.Scanner;

public class Remainders {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println((num1+num2)%num3);
        System.out.println(((num1%num3)+(num2%num3))%num3);
        System.out.println(num1*num2%num3);
        System.out.println(((num1%num3)*(num2%num3))%num3);
    }
}
