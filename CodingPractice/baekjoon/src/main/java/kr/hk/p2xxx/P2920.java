package kr.hk.p2xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        String answer = "";

        for(int i =0; i< 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> a = new ArrayList<Integer>();


        for(int i = 0;i < arr.length; i++) {
            if(i == 0) continue;
            if(arr[i] - 1 == arr[i+1] && answer.length() == 0) answer = "descending";
            else if (arr[i] + 1 == arr[i+1] && answer.length() == 0) answer = "ascending";
            else {
                answer = "mixed";
                break;
            }
        }

        System.out.println(answer);
    }

    public String solution(String[] args){
        int[] arr = new int[8];
        String answer = "";
        String[] line = args[0].split(" ");

        for(int i =0; i< 8; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }
        System.currentTimeMillis();
        DateFormat a;
        SimpleDateFormat b;
        for(int i = 0;i < arr.length; i++) {
            if(i == 0) continue;
            if(i+1 == arr.length) break;
            if(answer.length() == 0){
                if(arr[i] - 1 == arr[i+1]) answer = "descending";
                else if (arr[i] + 1 == arr[i+1]) answer = "ascending";
                else {
                    answer = "mixed";
                    break;
                }
            } else {
                if(answer.equals("descending") && arr[i] - 1 != arr[i+1]) {
                    answer = "mixed";
                    break;
                } else if(answer.equals("ascending") && arr[i] + 1 != arr[i+1]) {
                    answer = "mixed";
                    break;
                }
            }

        }

        return answer;
    }
}
