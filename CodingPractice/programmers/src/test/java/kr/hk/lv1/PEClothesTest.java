package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PEClothesTest {
    private PEClothes s = new PEClothes();

    @Test
    public void case1() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int expected = 5;

        int answer = s.solution(n,lost,reserve);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        int expected = 4;

        int answer = s.solution(n,lost,reserve);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int expected = 2;

        int answer = s.solution(n,lost,reserve);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() {
        int n = 5;
        int[] lost = {1,2,3,4,5};
        int[] reserve = {1};
        int expected = 1;

        int answer = s.solution(n,lost,reserve);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case5() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {5, 3};
        int expected = 5;

        int answer = s.solution(n,lost,reserve);

        assertThat(answer).isEqualTo(expected);
    }
}
