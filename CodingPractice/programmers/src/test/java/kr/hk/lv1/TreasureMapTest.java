package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TreasureMapTest {
    private TreasureMap s = new TreasureMap();

    @Test
    public void case1() {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] expected = {"#####","# # #", "### #", "#  ##", "#####"};

        String[] answer = s.solution(n, arr1, arr2);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        String[] expected = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};

        String[] answer = s.solution(n, arr1, arr2);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void testGetLineToString()  {
        int line = 1;
        String expected = "    #";

        String answer = s.getLineToString(line, 5);
        assertThat(answer).isEqualTo(expected);
    }
}
