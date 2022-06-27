package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CollatzConjectureTest {

    Solution s = new Solution();

    @Test
    public void case1() {
        int n = 626331;
        int expected = -1;

        int answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }

}
