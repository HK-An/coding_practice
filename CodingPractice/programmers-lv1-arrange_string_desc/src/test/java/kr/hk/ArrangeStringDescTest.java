package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArrangeStringDescTest {
    private Solution s = new Solution();

    @Test
    public void case1() {
        String str = "Zbcdefg";
        String expected = "gfedcbZ";

        String answer = s.solution(str);

        assertThat(answer).isEqualTo(expected);
    }
}
