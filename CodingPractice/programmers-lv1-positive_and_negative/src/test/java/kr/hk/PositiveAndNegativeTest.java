package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PositiveAndNegativeTest {
    private Solution solution = new Solution();
    private int[] absolutes1 = {4,7,12};
    private int[] absolutes2 = {1,2,3};
    private boolean[] signs1 = {true, false, true};
    private boolean[] signs2 = {false, false, true};

    @Test
    public void case1() {
        int expected = 9;
        int answer = solution.solution(absolutes1, signs1);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int expected = 0;
        int answer = solution.solution(absolutes2, signs2);

        assertThat(answer).isEqualTo(expected);
    }
}
