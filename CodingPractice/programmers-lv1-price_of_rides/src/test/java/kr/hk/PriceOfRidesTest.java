package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PriceOfRidesTest {
    private Solution s = new Solution();

    @Test
    public void case1() {
        int price = 3;
        int money = 20;
        int count = 4;
        long expected = 10L;

        long answer = s.solution(price, money, count);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int price = 1;
        int money = 10;
        int count = 3;
        long expected = 0L;

        long answer = s.solution(price, money, count);

        assertThat(answer).isEqualTo(expected);
    }
}
