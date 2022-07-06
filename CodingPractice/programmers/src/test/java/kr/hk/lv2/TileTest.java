package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TileTest {
    Tile tile = new Tile();

    @Test
    public void case1() {
        int n =  4;
        int expected = 5;

        assertThat(tile.solution(n)).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int n =  5;
        int expected = 8;

        assertThat(tile.solution(n)).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int n =  6;
        int expected = 13;

        assertThat(tile.solution(n)).isEqualTo(expected);
    }

}
