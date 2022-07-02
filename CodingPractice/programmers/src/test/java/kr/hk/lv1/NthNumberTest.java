package kr.hk.lv1;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NthNumberTest {
    private NthNumber nthNumber = new NthNumber();
    private int[] array = {1, 5, 2, 6, 3, 7, 4};

    @Test
    public void testSorted() throws Exception {
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] answer = Arrays.stream(array).sorted().toArray();

        assertThat(answer).isEqualTo(expected);
    }
    @Test
    public void testSplitArray() throws Exception {
        int start1 = 2;
        int start2 = 4;
        int start3 = 1;

        int end1 = 5;
        int end2 = 4;
        int end3 = 7;

        int[] expected1 = {5, 2, 6, 3};
        int[] expected2 = {6};
        int[] expected3 = array;

        int[] answer1 = nthNumber.splitArray(array, start1 - 1, end1 - 1);
        int[] answer2 = nthNumber.splitArray(array, start2 - 1, end2 - 1);
        int[] answer3 = nthNumber.splitArray(array, start3 - 1, end3 - 1);

        assertThat(answer1).isEqualTo(expected1);
        assertThat(answer2).isEqualTo(expected2);
        assertThat(answer3).isEqualTo(expected3);
    }

    @Test
    public void case1() throws Exception {
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] expected = {5, 6, 3};

        int[] answer = nthNumber.solution(array, commands);

        assertThat(answer).isEqualTo(expected);
    }

    
}
