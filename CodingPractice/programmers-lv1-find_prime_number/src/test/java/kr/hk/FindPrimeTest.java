package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FindPrimeTest {
    private Solution s = new Solution();

    @Test
    public void case1() {
        int n = 10;
        int expected = 4;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
