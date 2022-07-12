package kr.hk.lv2;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ScovilleTest {
    Scoville s = new Scoville();

    @Test
    public void case1() {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int expected = 2;

        int answer = s.solution(scoville, K );

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[] scoville = {1,1};
        int K = 100;
        int expected = -1;

        int answer = s.solution(scoville, K );

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int[] scoville = {0,0,1,2,6,6,6};
        int K = 5;
        int expected = -1;

        int answer = s.solution(scoville, K );

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() {
        int[] scoville = {1,2,3};
        int K = 11;
        int expected = 2;

        int answer = s.solution(scoville, K );

        assertThat(answer).isEqualTo(expected);
    }
}
