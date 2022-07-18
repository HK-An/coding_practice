package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CollatzConjectureTest {

    CollatzConjecture s = new CollatzConjecture();

    @Test
    public void case1() {
        int n = 626331;
        int expected = -1;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }

}
