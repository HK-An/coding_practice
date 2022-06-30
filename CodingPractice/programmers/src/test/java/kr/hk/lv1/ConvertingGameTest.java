package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ConvertingGameTest {

    ConvertingGame convertingGame = new ConvertingGame();

    @Test
    public void testIsNumberChar() throws Exception {
        boolean answer1 = convertingGame.isNumber('3');
        boolean answer2 = convertingGame.isNumber('q');

        assertThat(answer1).isEqualTo(true);
        assertThat(answer2).isEqualTo(false);
    }

    @Test
    public void testIsNumberStr() throws Exception {
        String str = "nine";
        boolean answer1 = convertingGame.isNumber(str);
        boolean answer2 = convertingGame.isNumber("nin");

        assertThat(answer1).isEqualTo(true);
        assertThat(answer2).isEqualTo(false);
    }

    @Test
    public void testConvertToNumFromString() throws Exception {
        String str = "nine";
        int expected = 9;

        int answer1 = convertingGame.convertToNumFromString(str);
        int answer2 = convertingGame.convertToNumFromString("nin");

        assertThat(answer1).isEqualTo(expected);
        assertThat(answer2).isEqualTo(-1);
    }

    @Test
    public void case1() throws Exception {
        String str = "one4seveneight";
        int expected = 1478;

        int answer = convertingGame.solution(str);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception {
        String str = "23four5six7";
        int expected = 234567;

        int answer = convertingGame.solution(str);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() throws Exception {
        String str = "2three45sixseven";
        int expected = 234567;

        int answer = convertingGame.solution(str);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case4() throws Exception {
        String str = "123";
        int expected = 123;

        int answer = convertingGame.solution(str);

        assertThat(answer).isEqualTo(expected);
    }
}
