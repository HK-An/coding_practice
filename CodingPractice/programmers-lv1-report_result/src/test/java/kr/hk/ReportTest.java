package kr.hk;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ReportTest {
    // 문제를 먼저 풀고 나중에 저장한 코드라서 메소드별 테스트 없음
    Solution s = new Solution();

    @Test
    public void case1() throws Exception {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] expected = {2,1,1,0};

        int[] answer = s.solution(id_list, report, k);
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] expected = {0,0};

        int[] answer = s.solution(id_list, report, k);
        assertThat(answer).isEqualTo(expected);
    }

}
