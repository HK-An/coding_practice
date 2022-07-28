package kr.hk.p10xxx;

import java.util.Scanner;

public class P10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String[] line = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[1]);
            if(num1 == 0 && num2 == 0) break;

            System.out.println(num1+num2);
        }
    }
}
