package kr.hk.p2xxx;

import java.util.Scanner;

public class P2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int answer=-1;

        if (N == 4 || N == 7) answer = -1;
        else if (N % 5 == 0) answer = N /5;
        else if (N % 5 == 1 || N % 5 == 3) answer = (N/5)+1;
        else if (N % 5 == 2 || N % 5 == 4) answer = (N/5)+2;

        System.out.println(answer);
    }
}
