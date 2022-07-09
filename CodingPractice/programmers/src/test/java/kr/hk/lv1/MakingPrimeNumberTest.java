package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MakingPrimeNumberTest {

    private MakingPrimeNumber mpk = new MakingPrimeNumber();
    private int[] nums1 = {1,2,3,4};
    private int[] nums2 = {1,2,7,6,4};

    @Test
    public void testIsPrime() {
        assertThat(mpk.isPrime(10)).isFalse();
        assertThat(mpk.isPrime(11)).isTrue();
    }

    @Test
    public void case1() {
        int expected = 1;
        int answer = mpk.solution(nums1);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int expected = 4;
        int answer = mpk.solution(nums2);

        assertThat(answer).isEqualTo(expected);
    }
}
