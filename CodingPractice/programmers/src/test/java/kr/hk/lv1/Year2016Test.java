package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Year2016Test {

    Year2016 year2016 = new Year2016();

    @Test
    public void case1() throws Exception {
        int a = 5;
        int b = 24;
        String expected = "TUE";

        String answer = year2016.solution(a, b);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception {
        int a = 5;
        int b = 1;
        String expected = "SUN";

        String answer = year2016.solution(a, b);

        assertThat(answer).isEqualTo(expected);
    }
}
