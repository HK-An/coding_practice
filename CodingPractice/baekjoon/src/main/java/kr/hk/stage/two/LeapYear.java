package kr.hk.stage.two;

import java.util.Scanner;

public class LeapYear {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 400 == 0) System.out.println(1);
        else System.out.println(0);
    }
}
