package kr.hk.lv2;

import java.util.Stack;

public class RemovePair {
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(stack.size() != 0 && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        answer = stack.size() == 0 ? 1 : 0;
        return answer;
    }
}
