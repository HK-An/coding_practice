package kr.hk.p2xxx;

import java.util.Scanner;

public class P2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();
        int n7 = sc.nextInt();
        int n8 = sc.nextInt();
        int n9 = sc.nextInt();

        int[] arr = new int[] {n1, n2, n3,n4,n5,n6,n7,n8,n9};
        int biggest = 0;
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(biggest < arr[i]) {
                biggest = arr[i];
                idx = i+1;
            }
        }
        System.out.println(biggest);
        System.out.println(idx);
    }
}
