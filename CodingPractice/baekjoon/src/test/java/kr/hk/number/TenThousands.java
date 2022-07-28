package kr.hk.number;

import kr.hk.number.thousands.ten.One4503;
import kr.hk.number.thousands.ten.One5649;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TenThousands {

    @Test
    public void test_14503() {
        One4503 s = new One4503();

        String[] args = {"3 3", "1 1 0", "1 1 1", "1 0 1", "1 1 1"};
        int expected = 1;

        int answer = s.main(args);
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_14503_1() {
        One4503 s = new One4503();

        String[] args = {"11 10", "7 4 0", "1 1 1 1 1 1 1 1 1 1", "1 0 0 0 0 0 0 0 0 1", "1 0 0 0 1 1 1 1 0 1", "1 0 0 1 1 0 0 0 0 1", "1 0 1 1 0 0 0 0 0 1"
        , "1 0 0 0 0 0 0 0 0 1", "1 0 0 0 0 0 0 1 0 1", "1 0 0 0 0 0 1 1 0 1", "1 0 0 0 0 0 1 1 0 1", "1 0 0 0 0 0 0 0 0 1", "1 1 1 1 1 1 1 1 1 1"};
        int expected = 57;

        int answer = s.main(args);
        assertThat(answer).isEqualTo(expected);
    }
}
