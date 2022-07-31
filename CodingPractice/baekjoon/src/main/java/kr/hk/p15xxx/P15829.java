package kr.hk.p15xxx;

import java.math.BigInteger;
import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/15829
* #문자열 #해싱
*
* 배운것
* 1. 매우매우 큰 숫자는 BigInteger을 사용하면 간편하게 다룰 수 있다.
* 2. 문제에서 나온 해시함수는 간단하지만 생각보다 자주 쓰인다고 한다.
* 3. 여기에 표현하기에는 너무 복잡하니 궁금하면 위의 링크를 확인해보자!
* */
public class P15829 {
    static final BigInteger M = new BigInteger("1234567891");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        BigInteger answer = new BigInteger("0");
        for(int i = 0; i < str.length(); i++) {
            answer = answer.add(BigInteger.valueOf(str.charAt(i) - 96)
                    .multiply(BigInteger.valueOf(31).pow(i)));
        }

        System.out.println(answer.remainder(M));

    }
}
