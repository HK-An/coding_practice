package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RemainTest {

    private Remain s = new Remain();

    @Test
    public void case1() {
        int n = 10;
        int expected = 3;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
