package kr.hk.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAbsenceNumber {
    public int solution(int[] numbers) {
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        List<Integer> absenceNumberList = getAbsenceNumberList(numberList);


        int answer = 0;
        for(int absenceNumber : absenceNumberList) {
            answer += absenceNumber;
        }
        return answer;
    }

    List<Integer> getAbsenceNumberList(List<Integer> numberList) {
        List<Integer> criteriaNumberList = Arrays.stream(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}).boxed().collect(Collectors.toList());
        List<Integer> absenceNumberList = new ArrayList<Integer>();

        for(int criteria : criteriaNumberList) {
            if(numberList.contains(criteria) == false) absenceNumberList.add(criteria);
        }
        return absenceNumberList;
    }
}
