package kr.hk;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ClawCraneGameTest {
    private int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    private int[] moves = {1,5,3,5,1,2,1,4};
    private Solution s = new Solution();

    @Test
    public void testGetDolls() throws Exception {
        List<Integer> stacks = s.getDolls(board, moves);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(3);
        expected.add(1);
        expected.add(1);
        expected.add(3);
        expected.add(2);
        expected.add(4);

        assertThat(stacks).isEqualTo(expected);
    }

    @Test
    public void case1() {
        int answer = s.solution(board, moves);
        int expected = 4;

        assertThat(answer).isEqualTo(expected);
    }
}
