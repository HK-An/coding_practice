package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CeasarCipherTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        String str = "AB";
        int n = 1;
        String expected = "BC";

        String answer = s.solution(str, n);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        String str = "z";
        int n = 1;
        String expected = "a";

        String answer = s.solution(str, n);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        String str = "a B z";
        int n = 4;
        String expected = "e F d";

        String answer = s.solution(str, n);

        assertThat(answer).isEqualTo(expected);
    }
}
