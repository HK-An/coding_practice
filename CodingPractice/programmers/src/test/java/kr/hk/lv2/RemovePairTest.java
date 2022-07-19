package kr.hk.lv2;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RemovePairTest {

    RemovePair rp = new RemovePair();

    @Test
    public void case1() {
        String s = "baabaa";
        int expected = 1;

        int answer = rp.solution(s);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        String s = "cdcd";
        int expected = 0;

        int answer = rp.solution(s);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void aa() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        System.out.println("queue");
        System.out.println(queue.remove());
        System.out.println(queue.peek());
    }
}
