package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NameCardTest {

    private Namecard s = new Namecard();

    @Test
    public void case1() {
        int[][] sizes = {{60, 50}, {30,70}, {60,30}, {80,40}};
        int expected = 4000;

        int answer = s.solution(sizes);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[][] sizes = {{10, 7}, {12,3}, {8,15}, {14,7}, {5,15}};
        int expected = 120;

        int answer = s.solution(sizes);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int[][] sizes = {{14, 4}, {19,6}, {6,16}, {18,7}, {7,11}};
        int expected = 133;

        int answer = s.solution(sizes);

        assertThat(answer).isEqualTo(expected);
    }

}
