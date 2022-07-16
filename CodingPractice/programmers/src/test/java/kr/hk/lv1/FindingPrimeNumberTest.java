package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FindingPrimeNumberTest {
    private FindingPrimeNumber s = new FindingPrimeNumber();

    @Test
    public void case1() {
        int n = 10;
        int expected = 4;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
