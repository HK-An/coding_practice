package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BudgetTest {

    private Budget s = new Budget();

    @Test
    public void case1() {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int expected = 3;

        int answer = s.solution(d, budget);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[] d = {2,2,3,3};
        int budget = 10;
        int expected = 4;

        int answer = s.solution(d, budget);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int[] d = {12,1,2,3};
        int budget = 10;
        int expected = 3;

        int answer = s.solution(d, budget);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() {
        int[] d = {3,10,1};
        int budget = 10;
        int expected = 2;

        int answer = s.solution(d, budget);

        assertThat(answer).isEqualTo(expected);
    }
}
