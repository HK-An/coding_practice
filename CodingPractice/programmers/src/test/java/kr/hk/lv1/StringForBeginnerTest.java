package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringForBeginnerTest {
    private StringForBeginner s = new StringForBeginner();

    @Test
    public void case1() {
        String str = "a1234";

        boolean answer = s.solution(str);

        assertThat(answer).isFalse();

    }

    @Test
    public void case2() {
        String str = "1234";

        boolean answer = s.solution(str);

        assertThat(answer).isTrue();

    }
}
