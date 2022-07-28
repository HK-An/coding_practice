package kr.hk.stage.three;

import org.junit.Test;

public class SmallerThanXTest {
    SmallerThanX stx = new SmallerThanX();

    @Test
    public void case1() {
        stx.solution("10 5", "1 10 4 9 2 3 8 5 7 6");
    }
}
