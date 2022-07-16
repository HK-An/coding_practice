package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArrangingStringDescTest {
    private ArrangingStringDesc s = new ArrangingStringDesc();

    @Test
    public void case1() {
        String str = "Zbcdefg";
        String expected = "gfedcbZ";

        String answer = s.solution(str);

        assertThat(answer).isEqualTo(expected);
    }
}
