package kr.hk.p11xxx;

import java.util.Scanner;

public class P11726 {
    /*
    아이디어-다이나믹프로그래밍
    1. A1: 1, A2: 2, A3: 1+2
    2. An: A(n-1) + A(n-2)
    3. for문으로 3부터 N까지 돌면서
    4. 이전값과 그 이전값을 더해서 저장(이때 10007로 나눈 나머지값
    )
    자료구조

    시간복잡도
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int answer = 0;
        if(n == 1) answer = 1;
        else if(n == 2) answer = 2;
        else {
            int n1 = 1;
            int n2= 2;
            for(int i = 3; i <= n; i++) {
                answer = (n1 + n2)%10007;
                if(i == n) break;
                n1 = n2;
                n2 = answer;
            }
        }

        System.out.println(answer);
    }
}
