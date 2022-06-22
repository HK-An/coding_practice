package kr.hk;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PocketmonTest {
    private Solution s = new Solution();

    @Test
    public void testGetMax() {
        int[] nums= {3,1,2,3,4,5, 11};
        long max = Arrays.stream(nums).distinct().count();

        assertThat(max).isEqualTo(6);
    }

    @Test
    public void case1() {
        int[] nums= {3,1,2,3};
        int expected = 2;

        int answer = s.solution(nums);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[] nums= {3,3,3,2,2,4};
        int expected = 3;

        int answer = s.solution(nums);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int[] nums= {3,3,3,2,2,2};
        int expected = 2;

        int answer = s.solution(nums);

        assertThat(answer).isEqualTo(expected);
    }
}
