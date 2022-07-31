package kr.hk.p1xxx;

import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/1259
* #구현 #문자열
* */
public class P1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int number = Integer.parseInt(sc.nextLine());
            if(number == 0) break;

            String numberStr = String.valueOf(number);
            if(numberStr.length() == 1) { // 1자리 수도 펠린드롬수라고 한다.
                System.out.println("yes");
                continue;
            }

            int halfIdx = numberStr.length() % 2 == 0 ? numberStr.length() / 2 : numberStr.length() / 2+1;
            String firstHalf = numberStr.substring(0, numberStr.length()/2);
            String secondHalf = numberStr.substring(halfIdx, numberStr.length());

            if(firstHalf.equals(reverse(secondHalf))) System.out.println("yes");
            else System.out.println("no");
        }
    }

    static String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
