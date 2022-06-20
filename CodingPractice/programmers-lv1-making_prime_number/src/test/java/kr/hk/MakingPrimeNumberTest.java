package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MakingPrimeNumberTest {

    private Solution solution = new Solution();
    private int[] nums1 = {1,2,3,4};
    private int[] nums2 = {1,2,7,6,4};

    @Test
    public void testIsPrime() {
        assertThat(solution.isPrime(10)).isFalse();
        assertThat(solution.isPrime(11)).isTrue();
    }

    @Test
    public void case1() {
        int expected = 1;
        int answer = solution.solution(nums1);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int expected = 4;
        int answer = solution.solution(nums2);

        assertThat(answer).isEqualTo(expected);
    }
}
