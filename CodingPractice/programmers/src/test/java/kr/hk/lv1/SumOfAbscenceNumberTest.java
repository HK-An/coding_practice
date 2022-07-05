package kr.hk.lv1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SumOfAbscenceNumberTest {

    private SumOfAbsenceNumber soan = new SumOfAbsenceNumber();
    private int[] numbers1 = {1,2,3,4,6,7,8,0};
    private int[] numbers2 = {5,8,4,0,6,7,9};

    @Test
    public void testGetAbsenceNumberList() {
        List<Integer> expected1 = new ArrayList<Integer>();
        expected1.add(5);
        expected1.add(9);
        List<Integer> expected2 = new ArrayList<Integer>();
        expected2.add(1);
        expected2.add(2);
        expected2.add(3);
        List<Integer> numberList1 = Arrays.stream(numbers1).boxed().collect(Collectors.toList());
        List<Integer> numberList2 = Arrays.stream(numbers2).boxed().collect(Collectors.toList());

        List<Integer> answer1 = soan.getAbsenceNumberList(numberList1);
        List<Integer> answer2 = soan.getAbsenceNumberList(numberList2);

        assertThat(answer1).isEqualTo(expected1);
        assertThat(answer2).isEqualTo(expected2);
    }


    @Test
    public void case1() {
        int expected = 14;
        int answer = soan.solution(numbers1);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() {
        int expected = 6;
        int answer = soan.solution(numbers2);

        assertThat(answer).isEqualTo(expected);
    }
}
