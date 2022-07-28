package kr.hk.p8xxx;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class P8xxxIntegratedTest {

    @Test
    public void test_8958() {
        Eight958 s = new Eight958();
        String[] args = {"5", "OOXXOXXOOO", "OOXXOOXXOO", "OXOXOXOXOXOXOX", "OOOOOOOOOO", "OOOOXOOOOXOOOOX"};

        String expected = "10\n" +
                "9\n" +
                "7\n" +
                "55\n" +
                "30";

        String answer = s.solution(args);

        assertThat(answer).isEqualTo(expected);

    }

    @Test
    public void test_8958_1() {
        Eight958 s = new Eight958();
        String[] args = {"1", "OXOXOXOXO"};

        String expected = "5";

        String answer = s.solution(args);

        assertThat(answer).isEqualTo(expected);

    }
}
