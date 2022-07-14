package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DivisorsTest {

    private Divisors s = new Divisors();

    @Test
    public void case1() {
        int left = 13;
        int right = 17;
        int expected = 43;

        int answer = s.solution(left, right);

        assertThat(answer).isEqualTo(expected);

    }

    @Test
    public void case2() {
        int left = 24;
        int right = 27;
        int expected = 52;

        int answer = s.solution(left, right);

        assertThat(answer).isEqualTo(expected);

    }

    @Test
    public void testIsDivisorOfNumEven() {
        int number = 4;
        int number1 = 8;
        int number2 = 13;

        boolean result = s.isDivisorOfNumEven(number);
        boolean result1 = s.isDivisorOfNumEven(number1);
        boolean result2 = s.isDivisorOfNumEven(number2);

        assertThat(result).isFalse();
        assertThat(result1).isTrue();
        assertThat(result2).isTrue();
    }
}
