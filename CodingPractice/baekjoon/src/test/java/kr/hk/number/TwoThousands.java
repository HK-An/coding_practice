package kr.hk.number;

import kr.hk.number.thousands.underten.two.Two675;
import kr.hk.number.thousands.underten.two.Two920;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TwoThousands {

    @Test
    public void test_2675() {
        Two675 s = new Two675();
        String[] args = {"2", "3 ABC", "5 /HTP"};
        String expected = "AAABBBCCC\n" +
                "/////HHHHHTTTTTPPPPP";

        String answer = s.solution(args);

        assertThat(answer).isEqualTo(expected);

    }

    @Test
    public void test_2920() {
        Two920 s = new Two920();
        String[] args = {"1 2 3 4 5 6 7 8"};
        String expected = "ascending";

        String answer = s.solution(args);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test() {
        int[] arr = {0, 4, 2, 5, 6};
        String d ="e";
        System.out.println(d.indexOf('z'));
        System.out.println(d.indexOf((char)49));
        StringBuilder s = new StringBuilder();
s.
        int answer = 0;
        for(int num : arr) {
            answer += Math.pow(num,2);
        }
        System.out.println(answer/10);
    }
}
