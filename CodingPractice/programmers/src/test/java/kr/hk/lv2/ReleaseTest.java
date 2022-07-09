package kr.hk.lv2;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ReleaseTest {

    Release r = new Release();

    @Test
    public void case1() {
        int[] progresses = {93, 30,55};
        int[] speeds = {1,30,5};
        int[] expected = {2,1};

        int[] answer = r.solution(progresses, speeds);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int[] progresses = {95,90,99,99,80,99};
        int[] speeds = {1,1,1,1,1,1};
        int[] expected = {1,3,2};

        int[] answer = r.solution(progresses, speeds);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() {
        int[] progresses = {20, 99, 93, 30, 55, 10};
        int[] speeds = {5, 10, 1, 1, 30, 5};
        int[] expected = {3, 3};

        int[] answer = r.solution(progresses, speeds);

        assertThat(answer).isEqualTo(expected);
    }
//    @DisplayName("기능개발")
//    @Nested
//    class ReleaseTest {
//        Release r = new Release();
//
//        @Test
//        public void case1() {
//            int[] progresses = {93, 30,55};
//            int[] speeds = {1,30,5};
//            int[] expected = {2,1};
//
//            int[] answer = r.solution(progresses, speeds);
//
//            assertThat(answer).isEqualTo(expected);
//        }
//
//        @Test
//        public void case2() {
//            int[] progresses = {95,90,99,99,80,99};
//            int[] speeds = {1,1,1,1,1,1};
//            int[] expected = {1,3,2};
//
//            int[] answer = r.solution(progresses, speeds);
//
//            assertThat(answer).isEqualTo(expected);
//        }
//    }
}
