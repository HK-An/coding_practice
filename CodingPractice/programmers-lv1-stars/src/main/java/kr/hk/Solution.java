package kr.hk;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = null;

        for(int i = 0; i < b; i++) {
            sb = new StringBuilder();
            for(int j = 0; j < a; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
}
