package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ReversingNumberTest {
    Solution s = new Solution();

    @Test
    public void case1() {
        int n = 12345;
        int[] expected = {5,4,3,2,1};

        int[] answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
