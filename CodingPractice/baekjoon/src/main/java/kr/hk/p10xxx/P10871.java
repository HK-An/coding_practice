package kr.hk.p10xxx;

import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String[] numbersArr = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(String number : numbersArr) {
            if(max > Integer.parseInt(number)) sb.append(number + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
