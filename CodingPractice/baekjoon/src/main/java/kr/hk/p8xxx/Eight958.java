package kr.hk.p8xxx;

import java.util.Scanner;

public class Eight958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        int c = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i =0; i < c; i++) {
            total = 0;
            int score = 0;
            String str = sc.nextLine();

            for(char ch : str.toCharArray()) {
                if(ch == 'O') {
                    score++;
                    total += score;
                } else score = 0;
            }
            sb.append(total + "\n");
        }
        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb.toString());
    }

    public String solution(String[] args) {
        int total;
        int c = Integer.parseInt(args[0]);
        StringBuilder sb = new StringBuilder();

        for(int i =0; i < c; i++) {
            total = 0;
            int score = 0;
            String str = args[i+1];

            for(char ch : str.toCharArray()) {
                if(ch == 'O') {
                    score++;
                    total += score;
                } else score = 0;
            }
            sb.append(total + "\n");
        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
