package kr.hk.lv2;

import kr.hk.lv1.YenAndYang;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class YenAndYangTest {
    private YenAndYang yay = new YenAndYang();
    private int[] absolutes1 = {4,7,12};
    private int[] absolutes2 = {1,2,3};
    private boolean[] signs1 = {true, false, true};
    private boolean[] signs2 = {false, false, true};

    @Test
    public void case1() {
        int expected = 9;
        int answer = yay.solution(absolutes1, signs1);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int expected = 0;
        int answer = yay.solution(absolutes2, signs2);

        assertThat(answer).isEqualTo(expected);
    }
}
