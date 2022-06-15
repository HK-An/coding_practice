package kr.hk;


import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IdRecommendationTest {

    Solution s = new Solution();

    @Test
    public void case1() throws Exception {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String expected = "bat.y.abcdefghi";

        String result = s.solution(new_id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception {
        String new_id = "z-+.^.";
        String expected = "z--";

        String result = s.solution(new_id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void case3() throws Exception {
        String new_id = "=.=";
        String expected = "aaa";

        String result = s.solution(new_id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void case4() throws Exception {
        String new_id = "123_.def";
        String expected = "123_.def";

        String result = s.solution(new_id);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void case5() throws Exception {
        String new_id = "abcdefghijklmn.p";
        String expected = "abcdefghijklmn";

        String result = s.solution(new_id);

        assertThat(result).isEqualTo(expected);
    }
}
