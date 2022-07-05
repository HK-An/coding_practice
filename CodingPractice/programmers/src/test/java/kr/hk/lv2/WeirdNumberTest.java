package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WeirdNumberTest {
    WeirdNumber wn = new WeirdNumber();

    @Test
    public void case1() {
        int n = 1;
        String answer = "1";
        String expected = wn.solution(n);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int n = 3;
        String answer = "4";
        String expected = wn.solution(n);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int n = 14;
        String answer = "112";
        String expected = wn.solution(n);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case5() {
        int n = 513;
        String answer = "124224";
        String expected = wn.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
