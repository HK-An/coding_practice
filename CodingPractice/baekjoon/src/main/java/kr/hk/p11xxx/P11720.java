package kr.hk.p11xxx;

import java.util.Scanner;

public class P11720 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        char[] items = sc.nextLine().toCharArray();
        int sum = 0;

        for(char item : items) {
            sum += Integer.parseInt(item+"");
        }

        System.out.println(sum);
    }
}
