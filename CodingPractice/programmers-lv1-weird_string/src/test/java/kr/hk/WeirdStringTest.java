package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WeirdStringTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        String str = "  aaa ";
        String expected = " AaA ";

        String answer = solution.solution(str);

        assertThat(answer).isEqualTo(expected);

    }
}
