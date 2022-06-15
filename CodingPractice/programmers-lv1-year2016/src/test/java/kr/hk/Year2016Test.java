package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Year2016Test {

    Solution s = new Solution();

    @Test
    public void case1() throws Exception {
        int a = 5;
        int b = 24;
        String expected = "TUE";

        String answer = s.solution(a, b);

        assertThat(answer).isEqualTo(expected);
    }
}
