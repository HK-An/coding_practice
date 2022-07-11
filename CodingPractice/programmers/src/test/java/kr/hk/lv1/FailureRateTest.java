package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FailureRateTest {

    private FailureRate s = new FailureRate();

    @Test
    public void case1() {
        int n = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] expected = {3,4,2,1,5};

        int[] answer = s.solution(n, stages);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int n = 4;
        int[] stages = {4,4,4,4,4};
        int[] expected = {4,1,2,3};

        int[] answer = s.solution(n, stages);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int n = 5;
        int[] stages = {3,3,3,3};
        int[] expected = {3,1,2,4,5};

        int[] answer = s.solution(n, stages);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void testGetFailureRate() {
        int[] stages = {2,1,2,6,2,4,3,3};

        double answer1 = s.getFailureRate(1, stages);
        double answer2 = Math.floor(s.getFailureRate(2, stages)*1000)/1000;
        double answer3 = s.getFailureRate(3, stages);
        double answer4 = s.getFailureRate(4, stages);

        assertThat(answer1).isEqualTo(0.125);
        assertThat(answer2).isEqualTo(0.428);
        assertThat(answer3).isEqualTo(0.5);
        assertThat(answer4).isEqualTo(0.5);
    }
}
