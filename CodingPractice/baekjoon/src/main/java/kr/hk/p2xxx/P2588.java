package kr.hk.p2xxx;

import java.util.Scanner;

public class P2588 {
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        String num2Str = sc.nextInt() + "";

        System.out.println(num1 * Integer.parseInt(num2Str.substring(2,3)));
        System.out.println(num1 * Integer.parseInt(num2Str.substring(1,2)));
        System.out.println(num1 * Integer.parseInt(num2Str.substring(0,1)));
        System.out.println(num1 * Integer.parseInt(num2Str));
    }
}
