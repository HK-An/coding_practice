package kr.hk.p10xxx;

import java.util.Scanner;

public class P10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for(int i=0; i< times; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(n1+n2);
        }
    }
}
