package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SumOfDivisorTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        int n = 1;
        int expected = 1;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
