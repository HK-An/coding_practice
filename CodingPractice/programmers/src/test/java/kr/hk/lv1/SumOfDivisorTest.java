package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SumOfDivisorTest {

    private SumOfDivisors s = new SumOfDivisors();

    @Test
    public void case1() {
        int n = 1;
        int expected = 1;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
