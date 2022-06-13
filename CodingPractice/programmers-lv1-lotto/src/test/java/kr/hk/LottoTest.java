package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LottoTest {

    // 문제를 먼저 풀고 나중에 저장한 코드라서 메소드별 테스트 없음

    Solution s = new Solution();

    @Test
    public void case1() throws Exception{
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] expected = {3, 5};

        int[] answer = s.solution(lottos, win_nums);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception{
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};


        int[] expected = {1, 6};
        int[] answer = s.solution(lottos, win_nums);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() throws Exception{
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};


        int[] expected = {1, 1};
        int[] answer = s.solution(lottos, win_nums);

        assertThat(answer).isEqualTo(expected);
    }
}
