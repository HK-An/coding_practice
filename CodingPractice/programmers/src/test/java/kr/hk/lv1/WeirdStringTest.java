package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WeirdStringTest {

    private WeirdString solution = new WeirdString();

    @Test
    public void case1() {
        String str = "try hello world";
        String expected = "TrY HeLlO WoRlD";

        String answer = solution.solution(str);

        assertThat(answer).isEqualTo(expected);

    }
}
