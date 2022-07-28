package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int min =  1000000;
        int max = -1000000;

        for(int i = 0; i < size; i++) {
            int value = Integer.parseInt(st.nextToken());
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        System.out.println(min + " " + max);
    }
}
