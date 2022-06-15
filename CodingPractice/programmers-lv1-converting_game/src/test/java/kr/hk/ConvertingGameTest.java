package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConvertingGameTest {

    Solution s = new Solution();

    @Test
    public void testIsNumber() throws Exception {
        String str = "nine";
        boolean answer1 = s.isNumber(str);
        boolean answer2 = s.isNumber("nin");

        assertThat(answer1).isEqualTo(true);
        assertThat(answer2).isEqualTo(false);
    }

    @Test
    public void case1() throws Exception {
        String str = "one4seveneight";
        int expected = 1478;

        int answer = s.solution(str);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception {
        String str = "23four5six7";
        int expected = 234567;

        int answer = s.solution(str);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() throws Exception {
        String str = "2three45sixseven";
        int expected = 234567;

        int answer = s.solution(str);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() throws Exception {
        String str = "123";
        int expected = 123;

        int answer = s.solution(str);

        assertThat(answer).isEqualTo(expected);
    }
}
