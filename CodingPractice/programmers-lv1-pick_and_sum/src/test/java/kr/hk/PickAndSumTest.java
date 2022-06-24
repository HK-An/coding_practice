package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PickAndSumTest {
    private Solution s = new Solution();

    @Test
    public void case1() {
        int[] numbers = {2,1,3,4,1};
        int[] expected= {2,3,4,5,6,7};

        int[] answer = s.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[] numbers = {5,0,2,7};
        int[] expected= {2,5,7,9,12};

        int[] answer = s.solution(numbers);

        assertThat(answer).isEqualTo(expected);
    }
}
