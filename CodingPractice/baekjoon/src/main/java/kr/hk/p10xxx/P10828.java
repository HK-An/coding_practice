package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/10828
* #자료구조 #스택
* 
* 스택을 직접 구현하는 문제
* */
public class P10828 {
    static class MyStack {
        int top;
        int[] stack;

        public MyStack(int size) {
            stack = new int[size];
            top = 0;
        }

        public void push(int val) {
            stack[top] = val;
            top++;
        }

        public int pop() {
            if(top < 1) return -1;
            int addr = top -1;
            top--;
            return stack[addr];
        }

        public int size() {
            return top;
        }

        public int empty() {
            return top < 1 ? 1:0 ;
        }

        public int top() {
            if(top < 1) return -1;
            int addr = top -1;
            return stack[addr];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        MyStack stack = new MyStack(size);

        for(int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")) {
                int val = Integer.parseInt(st.nextToken());
                stack.push(val);
            }
            else if(cmd.equals("top")) System.out.println(stack.top());
            else if(cmd.equals("size")) System.out.println(stack.size());
            else if(cmd.equals("empty")) System.out.println(stack.empty());
            else if(cmd.equals("pop")) System.out.println(stack.pop());
        }
    }
}
