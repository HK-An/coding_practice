package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GetCenterCharacterTest {

    private Solution solution = new Solution();

    @Test
    public void case1() throws Exception {
        String s = "abcde";
        String expected = "c";

        String answer = solution.solution(s);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception {
        String s = "qwer";
        String expected = "we";

        String answer = solution.solution(s);

        assertThat(answer).isEqualTo(expected);
    }
}
