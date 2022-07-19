package kr.hk.stage.two;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AlarmClockTest {
    AlarmClock ac = new AlarmClock();

    @Test
    public void case1() {
        int h = 10;
        int m = 10;
        String expected = "9 25";

        String answer = ac.solution(h, m);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int h = 0;
        int m = 30;
        String expected = "23 45";

        String answer = ac.solution(h, m);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int h = 23;
        int m = 40;
        String expected = "22 55";

        String answer = ac.solution(h, m);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() {
        int h = 0;
        int m = 44;
        String expected = "23 59";

        String answer = ac.solution(h, m);

        assertThat(answer).isEqualTo(expected);
    }
}
