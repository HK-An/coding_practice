package kr.hk.p2xxx;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class P2xxxIntegratedTest {

    @Test
    public void test_2675() {
        P2675 s = new P2675();
        String[] args = {"2", "3 ABC", "5 /HTP"};
        String expected = "AAABBBCCC\n" +
                "/////HHHHHTTTTTPPPPP";

        String answer = s.solution(args);

        assertThat(answer).isEqualTo(expected);

    }

    @Test
    public void test_2920() {
        P2920 s = new P2920();
        String[] args = {"1 2 3 4 5 6 7 8"};
        String expected = "ascending";

        String answer = s.solution(args);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2606_1() throws IOException {
        P2606 v = new P2606();
        String[] lines = {"7", "6", "1 2", "2 3", "1 5", "5 2", "5 6", "4 7"};
        int expected = 4;

        int answer = v.solution(lines);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2606_2() throws IOException {
        P2606 v = new P2606();
        String[] lines = {"2", "1", "1 2"};
        int expected = 1;

        int answer = v.solution(lines);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2606_3() throws IOException {
        P2606 v = new P2606();
        String[] lines = {"10", "7", "1 2", "2 3", "3 4", "5 6", "7 8", "8 9", "9 1"};
        int expected = 6;

        int answer = v.solution(lines);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2525_1() {
        P2525 ao = new P2525();

        String input = "14 30";
        int duration = 20;
        String expected = "14 50";

        String answer = ao.solution(input, duration);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2525_2() {
        P2525 ao = new P2525();

        String input = "17 40";
        int duration = 80;
        String expected = "19 0";

        String answer = ao.solution(input, duration);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2525_3() {
        P2525 ao = new P2525();

        String input = "23 48";
        int duration = 25;
        String expected = "0 13";

        String answer = ao.solution(input, duration);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2753_1() {
        P2753 ly = new P2753();

        int year = 2000;
        int expected = 1;

        int answer = ly.solution(year);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2753_2() {
        P2753 ly = new P2753();

        int year = 1999;
        int expected = 0;

        int answer = ly.solution(year);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2753_3() {
        P2753 ly = new P2753();

        int year = 2012;
        int expected = 1;

        int answer = ly.solution(year);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2753_4() {
        P2753 ly = new P2753();

        int year = 1900;
        int expected = 0;

        int answer = ly.solution(year);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2884_1() {
        P2884 ac = new P2884();

        int h = 10;
        int m = 10;
        String expected = "9 25";

        String answer = ac.solution(h, m);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2884_2() {
        P2884 ac = new P2884();

        int h = 0;
        int m = 30;
        String expected = "23 45";

        String answer = ac.solution(h, m);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2884_3() {
        P2884 ac = new P2884();

        int h = 23;
        int m = 40;
        String expected = "22 55";

        String answer = ac.solution(h, m);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_2884_4() {
        P2884 ac = new P2884();

        int h = 0;
        int m = 44;
        String expected = "23 59";

        String answer = ac.solution(h, m);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test() {

        int N = 10;
        int target = 4200;
        int[] values = new int[N];
        String[] args = ("1\n" +
                "5\n" +
                "10\n" +
                "50\n" +
                "100\n" +
                "500\n" +
                "1000\n" +
                "5000\n" +
                "10000\n" +
                "50000").split("\n");

        for(int i = 0; i < N; i++) {
            values[i] = Integer.parseInt(args[i]);
        }

        // 여기까지 입력

        int answer = 0;
        for(int i = N-1; i >= 0; i--) {
            int value = values[i];
            int share = target / value;

            if(share > 0) {
                target = target % value;
                answer+= share;
            }
            if(target == 0) break;
        }

        System.out.println(answer);
    }
}

