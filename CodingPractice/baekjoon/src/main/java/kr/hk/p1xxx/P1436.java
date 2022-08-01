package kr.hk.p1xxx;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/1436
* #브루트포스
*
* 간단한데 브루트포스는 시간복잡도를 어떻게 측정해야하는지..
* 검색해도 정확하게 어떻게 측정하는지에 대한 방법은 없다.
*
* */

public class P1436 {
    /*
    아이디어
        1. 입력: number of movie(int N)
        2. 반복문을 사용하여 수를 1식 증가시킨다.
        3. 수를 str했을때 666을 포함하는지 확인한다.
        4. 포함하면 count를 1씩 증가시킨다.
        5. count == N이면 숫자를 출력 break

    변수
    int N (N <= 10000)
    series (long series) (cannot expect)
    long count

    시간복잡도
    ??
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        long series = 666L;
        int count = 1;

        while(true) {
            if(N == count) {
                System.out.println(series);
                break;
            }

            series++;
            if(String.valueOf(series).contains("666")) count++;
        }
    }
}
