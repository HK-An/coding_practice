package kr.hk.p10xxx;

import java.util.Scanner;

public class P10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 'a'; i <= 'z'; i++) {
            sb.append(str.indexOf(i) + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
