package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RetiredParticipantTest {

    private Solution s = new Solution();

    @Test
    public void test1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String expected = "leo";

        String answer = s.solution(participant, completion);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test2() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String expected = "vinko";

        String answer = s.solution(participant, completion);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String expected = "mislav";

        String answer = s.solution(participant, completion);

        assertThat(answer).isEqualTo(expected);
    }
}
