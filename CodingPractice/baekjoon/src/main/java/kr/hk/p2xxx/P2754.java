package kr.hk.p2xxx;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/2754
* #구현 #문자열
* */
public class P2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();

        if(grade.equals("A+")) System.out.println("4.3");
        else if(grade.equals("A0")) System.out.println("4.0");
        else if(grade.equals("A-")) System.out.println("3.7");
        else if(grade.equals("B+")) System.out.println("3.3");
        else if(grade.equals("B0")) System.out.println("3.0");
        else if(grade.equals("B-")) System.out.println("2.7");
        else if(grade.equals("C+")) System.out.println("2.3");
        else if(grade.equals("C0")) System.out.println("2.0");
        else if(grade.equals("C-")) System.out.println("1.7");
        else if(grade.equals("D+")) System.out.println("1.3");
        else if(grade.equals("D0")) System.out.println("1.0");
        else if(grade.equals("D-")) System.out.println("0.7");
        else System.out.println("0.0");
    }
}
