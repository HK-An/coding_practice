package kr.hk.p3xxx;

import java.util.HashSet;
import java.util.Scanner;

public class P3052 {
    /*
        아이디어
        1. 입력받아 나머지를 구하여 hashset에 넣는다.
        2. hashset의 총 원소 수를 출력하낟.

        자료구조
        hashset: 중복된 값을 가지지 않음
        */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numSet = new HashSet<>();

        for(int i =0; i < 10; i++) {
            int n = Integer.parseInt(sc.nextLine());
            int remainder = n % 42;
            numSet.add(remainder);
        }

        System.out.println(numSet.size());
    }
}
