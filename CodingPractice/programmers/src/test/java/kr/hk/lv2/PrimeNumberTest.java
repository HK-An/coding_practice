package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrimeNumberTest {

    PrimeNumber s = new PrimeNumber();

    @Test
    public void case1() {
        String numbers = "17";
        int expected = 3;

        int answer = s.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        String numbers = "011";
        int expected = 2;

        int answer = s.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        String numbers = "1231";
        int expected = 18;

        int answer = s.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }
}
