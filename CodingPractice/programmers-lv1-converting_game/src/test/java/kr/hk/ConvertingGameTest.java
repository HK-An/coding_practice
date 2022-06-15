package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConvertingGameTest {

    Solution s = new Solution();

    @Test
    public void testIsNumberChar() throws Exception {
        boolean answer1 = s.isNumber('3');
        boolean answer2 = s.isNumber('q');

        assertThat(answer1).isEqualTo(true);
        assertThat(answer2).isEqualTo(false);
    }

    @Test
    public void testIsNumberStr() throws Exception {
        String str = "nine";
        boolean answer1 = s.isNumber(str);
        boolean answer2 = s.isNumber("nin");

        assertThat(answer1).isEqualTo(true);
        assertThat(answer2).isEqualTo(false);
    }

    @Test
    public void testConvertToNumFromString() throws Exception {
        String str = "nine";
        int expected = 9;

        int answer1 = s.convertToNumFromString(str);
        int answer2 = s.convertToNumFromString("nin");

        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(-1);
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
