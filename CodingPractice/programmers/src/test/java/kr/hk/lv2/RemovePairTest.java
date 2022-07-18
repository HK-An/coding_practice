package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RemovePairTest {

    RemovePair rp = new RemovePair();

    @Test
    public void case1() {
        String s = "baabaa";
        int expected = 1;

        int answer = rp.solution(s);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        String s = "cdcd";
        int expected = 0;

        int answer = rp.solution(s);

        assertThat(answer).isEqualTo(expected);
    }
}
