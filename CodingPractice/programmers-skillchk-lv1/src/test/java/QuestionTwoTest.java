import kr.hk.QuestionTwo;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QuestionTwoTest {

    private QuestionTwo q2 = new QuestionTwo();

    @Test
    public void case1()  throws Exception{
        // given
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        // when
        int answer = q2.solution(a,b);

        // then

        assertThat(answer).isEqualTo(3);
    }

    @Test
    public void case2()  throws Exception{
        // given
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};

        // when
        int answer = q2.solution(a,b);

        // then

        assertThat(answer).isEqualTo(-2);
    }
}
