package kr.hk.p2xxx;

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int constructor = 0;

        for(int i = 1; i < N; i++) {
            String str = i+"";
            int sum = i;
            for(String s : str.split("")) {
                sum += Integer.parseInt(s);
            }
            if(sum == N) {
                constructor = i;
                break;
            }
        }

        System.out.println(constructor);
    }

}
