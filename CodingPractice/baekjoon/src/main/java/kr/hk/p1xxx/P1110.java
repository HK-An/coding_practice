package kr.hk.p1xxx;

import java.util.Scanner;

public class P1110 {
    /*
    아이디어
    1. 입력: 숫자(N)
    2. N이 10보다 작으면 N*10 => t1
    3. t1의 각 자리 수를 더한다.=> t2
    4. "t1의 1의 자리"+"t2 1의 자리" => t1
    5. 만약 t1이 N과 같으면 반복 횟수를 출력한다.
    6. 만약 N == 0이면 1을 출력한다.

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int t1;
        int count = 0;

        if(N < 10) {
            t1 = N * 10;
            N = t1;
        }
        else t1 = N;

        while(true) {
            if(N == 0) {
                count = 1;
                break;
            }
            if(t1 == N && count != 0) break;

            count++;

            String lastOfT1 = String.valueOf(t1).charAt(String.valueOf(t1).length()-1) + "";
            String tenPlaceOfT1 = String.valueOf(t1).length() == 1 ? "0" : String.valueOf(t1).charAt(0) + "";
            int t2 = Integer.parseInt(lastOfT1) + Integer.parseInt(tenPlaceOfT1);
            String lastOfT2 = String.valueOf(t2).charAt(String.valueOf(t2).length()-1) + "";

            t1 = Integer.parseInt(lastOfT1 + lastOfT2);
        }


        System.out.println(count);
    }
}
