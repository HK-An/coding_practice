package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrialExamTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        int[] answers = {1,2,3,4,5};
        int[] expected = {1};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[] answers = {1,3,2,4,2};
        int[] expected = {1,2,3};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int[] answers = {4};
        int[] expected = {};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() {
        int[] answers = {1,1,1,1,1};
        int[] expected = {3};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case5() {
        int[] answers = {5,5,5,5,5};
        int[] expected = {1};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case6() {
        int[] answers = {2,1,2,3,2};
        int[] expected = {2};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case7() {
        int[] answers = {1,2,2,3,4};
        int[] expected = {1,2};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case8() {
        int[] answers = {2,1,1,1,4};
        int[] expected = {2,3};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case9() {
        int[] answers = {1,2,1,1,4};
        int[] expected = {1,3};

        int[] answer = s.solution(answers);

        assertThat(answer).isEqualTo(expected);
    }
}
