package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArrangingStringTest {

    private Solution s = new Solution();

    @Test
    public void case1() {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] expected = {"car", "bed", "sun"};

        String[] answer = s.solution(strings,n);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] expected = {"abcd", "abce", "cdx"};

        String[] answer = s.solution(strings,n);

        assertThat(answer).isEqualTo(expected);
    }
}
