package kr.hk.stage.two;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AutomatedOvenTest {

    AutomatedOven ao = new AutomatedOven();

    @Test
    public void case1() {
        String input = "14 30";
        int duration = 20;
        String expected = "14 50";

        String answer = ao.solution(input, duration);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        String input = "17 40";
        int duration = 80;
        String expected = "19 0";

        String answer = ao.solution(input, duration);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        String input = "23 48";
        int duration = 25;
        String expected = "0 13";

        String answer = ao.solution(input, duration);

        assertThat(answer).isEqualTo(expected);
    }
}
