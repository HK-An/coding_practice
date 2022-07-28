package kr.hk.p2xxx;

import java.util.Scanner;

public class P2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        if(d1 == d2 && d2 == d3) System.out.println(10000 + d1 * 1000);
        else if(d1 == d2 && d2 != d3) System.out.println(getSecondPrize(d1));
        else if(d1 == d3 && d1 != d2) System.out.println(getSecondPrize(d1));
        else if(d2 == d3 && d1 != d2) System.out.println(getSecondPrize(d2));
        else System.out.println(Math.max(d1, Math.max(d2, d3)) * 100);
    }

    static String getSecondPrize(int num) {
        return 1000 + num * 100 + "";
    }
}
