package kr.hk.stage.two;

import java.util.Scanner;

public class Comparing {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String answer;

        if(num1 > num2) answer = ">";
        else if(num1 < num2) answer = "<";
        else answer = "==";

        System.out.println(answer);
    }
}
