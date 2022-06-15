import kr.hk.QuestionOne;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QuestionOneTest {

    private QuestionOne q1 = new QuestionOne();

    @Test
    public void testCase1() throws Exception {
        // given
        int[] intArr = {1,1,3,3,0,1,1};
        int[] expected = {1,3,0,1};

        // when
        int[] result = q1.solution(intArr);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCase2() throws Exception {
        // given
        int[] intArr = {4,4,4,3,3};
        int[] expected = {4,3};

        // when
        int[] result = q1.solution(intArr);

        // then
        assertThat(result).isEqualTo(expected);
    }
}
