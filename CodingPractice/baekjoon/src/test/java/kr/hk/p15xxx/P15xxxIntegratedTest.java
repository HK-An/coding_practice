package kr.hk.p15xxx;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class P15xxxIntegratedTest {

    @Test
    public void test_15649() {
        P15649 s = new P15649();
        String[] args = {"3", "1"};

        String expected = "1\n" +
                "2\n" +
                "3";

        String answer = s.main(args);

        assertThat(answer).isEqualTo(expected);

    }
}
