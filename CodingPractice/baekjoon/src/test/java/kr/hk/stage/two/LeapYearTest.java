package kr.hk.stage.two;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LeapYearTest {

    LeapYear ly = new LeapYear();

    @Test
    public void case1() {
        int year = 2000;
        int expected = 1;

        int answer = ly.solution(year);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int year = 1999;
        int expected = 0;

        int answer = ly.solution(year);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int year = 2012;
        int expected = 1;

        int answer = ly.solution(year);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() {
        int year = 1900;
        int expected = 0;

        int answer = ly.solution(year);

        assertThat(answer).isEqualTo(expected);
    }
}
