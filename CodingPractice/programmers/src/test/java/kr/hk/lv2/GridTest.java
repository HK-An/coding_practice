package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GridTest {

    Grid g = new Grid();

    @Test
    public void case1() {
        int w = 8;
        int h = 12;
        long expected = 80;

        long answer = g.solution(w,h);

        assertThat(answer).isEqualTo(expected);
    }
}
