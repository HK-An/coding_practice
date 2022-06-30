package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GetCenterCharacterTest {

    private GetCenterCharacter centerCharacter = new GetCenterCharacter();

    @Test
    public void case1() throws Exception {
        String s = "abcde";
        String expected = "c";

        String answer = centerCharacter.solution(s);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception {
        String s = "qwer";
        String expected = "we";

        String answer = centerCharacter.solution(s);

        assertThat(answer).isEqualTo(expected);
    }
}
