package kr.hk.p2xxx;

import java.util.Scanner;

public class P2753 {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println(1);
        else System.out.println(0);
    }

    public int solution(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return 1;
        else return 0;
    }
}
