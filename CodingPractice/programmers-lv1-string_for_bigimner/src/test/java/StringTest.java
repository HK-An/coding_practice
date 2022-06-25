import kr.hk.Solution;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringTest {
    private Solution s = new Solution();

    @Test
    public void case1() {
        String str = "a1234";

        boolean answer = s.solution(str);

        assertThat(answer).isFalse();

    }

    @Test
    public void case2() {
        String str = "1234";

        boolean answer = s.solution(str);

        assertThat(answer).isTrue();

    }
}
