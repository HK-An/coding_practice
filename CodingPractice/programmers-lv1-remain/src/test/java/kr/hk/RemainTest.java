package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RemainTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        int n = 10;
        int expected = 3;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
