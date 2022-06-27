package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DartGameTest {
    private Solution s = new Solution();

    @Test
    public void case1() {
        String dartResult = "1S2D*3T";
        int expected = 37;

        int answer = s.solution(dartResult);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        String dartResult = "1D2S#10S";
        int expected = 9;

        int answer = s.solution(dartResult);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        String dartResult = "1D2S0T";
        int expected = 3;

        int answer = s.solution(dartResult);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() {
        String dartResult = "1S*2T*3S";
        int expected = 23;

        int answer = s.solution(dartResult);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case5() {
        String dartResult = "1D#2S*3S";
        int expected = 5;

        int answer = s.solution(dartResult);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case6() {
        String dartResult = "1T2D3D#";
        int expected = -4;

        int answer = s.solution(dartResult);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case7() {
        String dartResult = "1D2S3T*";
        int expected = 59;

        int answer = s.solution(dartResult);

        assertThat(answer).isEqualTo(expected);
    }
}
