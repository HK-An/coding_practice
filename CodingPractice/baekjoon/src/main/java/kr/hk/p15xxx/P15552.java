package kr.hk.p15xxx;

import java.util.Scanner;

public class P15552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < times; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            sb.append(n1+n2);
            if(i != times - 1) sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
