package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SumOfAbscenceNumberTest {

    private SumOfAbsenceNumber soan = new SumOfAbsenceNumber();
    private int[] numbers1 = {1,2,3,4,6,7,8,0};
    private int[] numbers2 = {5,8,4,0,6,7,9};

    @Test
    public void case1() {
        int expected = 14;
        int answer = soan.solution(numbers1);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int expected = 6;
        int answer = soan.solution(numbers2);

        assertThat(answer).isEqualTo(expected);
    }
}
