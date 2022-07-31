package kr.hk.p2xxx;

import java.util.Scanner;
/*
* https://solved.ac/problems/sprout
* #구현 #문자열
* */

public class P2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(c<97) c+= 32;
            else c-=32;

            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
