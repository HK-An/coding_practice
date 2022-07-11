package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TargetNumberTest {
    TargetNumber tn = new TargetNumber();

    @Test
    public void case1() {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int expected = 5;

        int answer = tn.solution(numbers, target);

        assertThat(answer).isEqualTo(expected);

    }
}
