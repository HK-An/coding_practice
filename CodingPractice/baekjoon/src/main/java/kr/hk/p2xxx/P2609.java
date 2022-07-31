package kr.hk.p2xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/2609
* #수학 #정수론 #유클리드호제법
*
* 복습하기
* 유클리드호제법
* n1 > n2
* gcd = loop(
*               if(n1 % n2 == 0) gcd = n2; break;
*               n1 = n2
*               n2 = n1%n2
*       )
* lcm = 최초n1 * 최초n2 / gcd
* */
public class P2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int n1 = Math.max(a,b);
        int n2 = Math.min(a,b);
        int gcd = 0;

        while(true) {
            int remainder = n1 % n2;
            if(remainder == 0) {
                gcd = n2;
                break;
            }

            n1 = n2;
            n2 = remainder;
        }
        System.out.println(gcd);

        System.out.println(a * b / gcd);
    }
}
