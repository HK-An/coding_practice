package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ReverseTernaryTest {

    private ReversingTernary s = new ReversingTernary();

    @Test
    public void case1() {
        int n = 45;
        int expected = 7;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int n = 125;
        int expected = 229;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
