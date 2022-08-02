package kr.hk.p11xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/11866
* #구현 #자료구조 #큐
* */
public class P11866 {
    static int N;
    static boolean[] people;
    static int buffer;
    static StringBuilder sb = new StringBuilder();
    static int remain;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        buffer = Integer.parseInt(st.nextToken());
        people = new boolean[N+1];
        remain = N;

        search(0+buffer);

        System.out.println("<"+sb.toString().substring(0,sb.length()-2)+">");
    }

    static void search(int addr) {
        if(remain == 0) return;
        if(people[addr] == false) {
            people[addr] = true;
            sb.append(addr + ", ");
            remain--;
        }

        int newAddr = addr;
        int count = 0;
        while(remain != 0) {
            newAddr++;
            if(newAddr > N) newAddr -= N;
            if(people[newAddr] == false) count++;
            if(count == buffer) break;
        }

        search(newAddr);
    }
}
