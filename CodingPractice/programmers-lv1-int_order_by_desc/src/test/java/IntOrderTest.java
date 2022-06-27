import kr.hk.Solution;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IntOrderTest {

    Solution s = new Solution();

    @Test
    public void case1(){
        long n = 118372L;
        long expected = 873211L;

        long answer = s.solution(n);

        assertThat(answer).isEqualTo(expected);
    }
}
