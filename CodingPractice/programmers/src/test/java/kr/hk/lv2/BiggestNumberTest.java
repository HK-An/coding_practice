package kr.hk.lv2;


import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BiggestNumberTest {

    BiggestNumber bn = new BiggestNumber();

    @Test
    public void case1() {
        int[] numbers = {6,10,2};
        String expected = "6210";

        String answer = bn.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[] numbers = {3, 30, 34, 5, 9};
        String expected = "9534330";

        String answer = bn.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int[] numbers = {0,0,0};
        String expected = "0";

        String answer = bn.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() {
        int[] numbers = {3,0,0};
        String expected = "300";

        String answer = bn.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }
}
