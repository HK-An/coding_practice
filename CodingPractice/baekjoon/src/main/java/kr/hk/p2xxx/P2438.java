package kr.hk.p2xxx;

import java.util.Scanner;

public class P2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stories = sc.nextInt();

        for(int i = 1; i <= stories; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
}
