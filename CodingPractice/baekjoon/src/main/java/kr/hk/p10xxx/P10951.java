package kr.hk.p10xxx;

import java.util.Scanner;

public class P10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[1]);

            System.out.println(num1+num2);
        }
    }
}
