package kr.hk.p11xxx;

import java.util.Scanner;

public class P11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for(int i = 1; i <= cases; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("Case #" + i + ": " + (n1+n2));
        }
    }
}
