package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GcdLcmTest {
    Solution s = new Solution();

    @Test
    public void case1() {
        int n = 1254;
        int m = 582;
        int[] expected = {6,121638};

        int[] answer = s.solution(n,m);

        assertThat(answer).isEqualTo(expected);

    }

    @Test
    public void case2() {
        int n = 1;
        int m = 1;
        int[] expected = {1,1};

        int[] answer = s.solution(n,m);

        assertThat(answer).isEqualTo(expected);

    }
}
