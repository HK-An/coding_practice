package kr.hk.algorithm.dfs;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VirusTest {
    Virus v = new Virus();

    @Test
    public void case1() throws IOException {
        String[] lines = {"7", "6", "1 2", "2 3", "1 5", "5 2", "5 6", "4 7"};
        int expected = 4;

        int answer = v.solution(lines);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws IOException {
        String[] lines = {"2", "1", "1 2"};
        int expected = 1;

        int answer = v.solution(lines);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() throws IOException {
        String[] lines = {"10", "7", "1 2", "2 3", "3 4", "5 6", "7 8", "8 9", "9 1"};
        int expected = 6;

        int answer = v.solution(lines);

        assertThat(answer).isEqualTo(expected);
    }
}
