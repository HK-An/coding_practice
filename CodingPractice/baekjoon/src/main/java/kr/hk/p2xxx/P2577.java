package kr.hk.p2xxx;

import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        long multipled = n1 * n2 * n3;
        String multipledStr = multipled + "";

        for(int i ='0'; i <='9'; i++) {
            int count = 0;
            for(char c : multipledStr.toCharArray()) {
                if(c == i) count++;
            }
            sb.append(count + "\n");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
