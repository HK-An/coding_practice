package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DisguiseTest {
    Disguise d = new Disguise();

    @Test
    public void case1() {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int expected = 5;

        int answer = d.solution(clothes);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int expected = 3;

        int answer = d.solution(clothes);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        String[][] clothes = {{"round_glass", "face"}, {"black_sunglasses", "face"}, {"blue_tshirt", "top"}, {"jeans", "bottom"}, {"long_coat", "outer"}};
        int expected = 20;

        int answer = d.solution(clothes);

        assertThat(answer).isEqualTo(expected);
    }
}
