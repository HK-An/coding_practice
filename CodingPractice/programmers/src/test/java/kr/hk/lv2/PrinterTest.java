package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class PrinterTest {
    Printer p = new Printer();

    @Test
    public void case1() {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int expected = 1;

        int result = p.solution(priorities, location);

        assertThat(result).isEqualTo(expected);
    }
}
