package kr.hk.p2xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(st.nextToken());
        for(int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(char ch : str.toCharArray()) {
                for(int j = 0; j < r; j++) {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }

        sb.delete(sb.length()-2, sb.length()-1);

        System.out.println(sb.toString());
    }

    public String solution(String[] args)  {
        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(args[0]);
        for(int i = 0; i < c; i++) {
            String[] line = args[i+1].split(" ");
            int r = Integer.parseInt(line[0]);
            String str = line[1];

            for(char ch : str.toCharArray()) {
                for(int j = 0; j < r; j++) {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }

//        sb.delete(sb.length()-2, sb.length()-1);
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
