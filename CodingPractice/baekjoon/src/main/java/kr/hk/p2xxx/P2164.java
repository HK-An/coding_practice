package kr.hk.p2xxx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/2164
* #자료구조 #큐
*
* 걸린시간: 5m
* */

public class P2164 {
    /*
   아이디어
       1. 입력: int N
       2. 1부터 N까지의 큐를 만든다.
       3. 가장 앞의 값을 poll
       4. 다시 poll하여 이번 값은 add한다.
       5. 큐의 크기가 1인가? 출력 : 3번이동

   변수

   시간복잡도
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            q.add(i);
        }// 여기까지 입력

        while(true) {
            if(q.size() == 1) {
                System.out.println(q.poll());
                break;
            }

            q.poll();
            q.add(q.poll());
        }
    }
}
