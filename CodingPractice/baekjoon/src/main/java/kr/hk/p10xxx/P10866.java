package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            String[] lines = st.nextToken().split(" ");

            String cmd = lines[0];
            if(cmd.equals("push_back")) deque.offerLast(Integer.parseInt(lines[1]));
            else if(cmd.equals("push_front")) deque.offerFirst(Integer.parseInt(lines[1]));
            else if(cmd.equals("pop_front")) System.out.println(deque.pollFirst());
            else if(cmd.equals("pop_back")) System.out.println(deque.pollLast());
            else if(cmd.equals("size")) System.out.println(deque.size());
            else if(cmd.equals("empty")) {
                int result = deque.isEmpty() == true ? 1 : 0;
                System.out.println(result);
            }
            else if(cmd.equals("front")) System.out.println(deque.peekFirst());
            else System.out.println(deque.peekLast());
        }
    }
}
