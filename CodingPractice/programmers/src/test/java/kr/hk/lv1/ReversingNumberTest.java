package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ReversingNumberTest {
    ReversingNumber s = new ReversingNumber();

    @Test
    public void case1() {
        int n = 12345;
        int[] expected = {5,4,3,2,1};

        int[] answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
