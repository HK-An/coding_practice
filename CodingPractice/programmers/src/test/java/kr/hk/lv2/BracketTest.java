package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BracketTest {
    Bracket b = new Bracket();

    @Test
    public void case1() {
        String s = "()()";

        boolean answer = b.solution(s);

        assertThat(answer).isTrue();
    }

    @Test
    public void case2() {
        String s = "(())()";

        boolean answer = b.solution(s);

        assertThat(answer).isTrue();
    }

    @Test
    public void case3() {
        String s = ")()(";

        boolean answer = b.solution(s);

        assertThat(answer).isFalse();
    }

    @Test
    public void case4() {
        String s = "(()(";

        boolean answer = b.solution(s);

        assertThat(answer).isFalse();
    }
}
