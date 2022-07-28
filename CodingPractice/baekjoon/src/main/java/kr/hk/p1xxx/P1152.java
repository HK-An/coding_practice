package kr.hk.p1xxx;

import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        int answer = 0;
        for(String str : strArr) {
            if(str.length() != 0) answer++;
        }
        System.out.println(answer);
    }
}
