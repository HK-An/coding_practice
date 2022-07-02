package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ColoringBookTest {

    ColoringBook cb = new ColoringBook();

    @Test
    public void case1() {
        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
        int[] expected = {2,6};

        int[] answer = cb.solution(m,n,picture);

        assertThat(answer).isEqualTo(expected);

    }
}
