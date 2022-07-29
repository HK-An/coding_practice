package kr.hk.p4xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            if(n1 == 0 && n2 == 0 && n3 == 0) break;

            int[] numbers = new int[]{n1, n2, n3};
            Arrays.sort(numbers);
            if(Math.pow(numbers[2], 2) == Math.pow(numbers[0], 2) + Math.pow(numbers[1], 2)) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
