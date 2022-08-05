package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/10845
* #자료구조 #큐
* */
public class P10845 {
    static class MyQueue {
        int dataSize;
        int[] datas;
        int popPointer;
        int insertPointer;

        MyQueue(int size) {
            dataSize = 0;
            popPointer = 0;
            insertPointer = 0;
            datas = new int[size];
        }

        public void push(int val) {
            dataSize++;
            datas[insertPointer++] = val;
        }

        public int pop() {
            if(dataSize == 0) return -1;
            dataSize--;
            return datas[popPointer++];
        }

        public int size() {
            return dataSize;
        }

        public int empty() {
            return dataSize == 0 || datas.length == 0 ? 1 : 0;
        }

        public int front() {
            return dataSize == 0 ? -1 : datas[popPointer];
        }

        public int back() {
            return dataSize == 0 ? -1 : datas[insertPointer-1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        MyQueue q = new MyQueue(N);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if(cmd.equals("push")) {
                int value = Integer.parseInt(st.nextToken());
                q.push(value);
            } else if(cmd.equals("pop")) sb.append(q.pop());
            else if(cmd.equals("size")) sb.append(q.size());
            else if(cmd.equals("empty")) sb.append(q.empty());
            else if(cmd.equals("front")) sb.append(q.front());
            else sb.append(q.back());

            if(cmd.equals("push") == false) sb.append("\n");
        }
        System.out.println(sb);
    }
}
