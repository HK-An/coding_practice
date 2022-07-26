package kr.hk.number;

import kr.hk.number.thousands.ten.One5649;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FifteenThousands {

    @Test
    public void test_15649() {
        One5649 s = new One5649();
        String[] args = {"3", "1"};

        String expected = "1\n" +
                "2\n" +
                "3";

        String answer = s.main(args);

        assertThat(answer).isEqualTo(expected);

    }
}
