package kr.hk.lv1;

import java.util.ArrayList;
import java.util.List;

public class SumOfAbsenceNumber {
    public int solution(int[] numbers) {
        List<Integer> absenceNumberList = getAbsenceNumberList(numbers);

        int answer = 0;
        for(int absenceNumber : absenceNumberList) {
            answer += absenceNumber;
        }
        return answer;
    }

    List<Integer> getAbsenceNumberList(int[] numbers) {
        int[] basicNumbers = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> absenceNumberList = new ArrayList<Integer>();

        for(int criteria : basicNumbers) {
            for(int i = 0; i < numbers.length; i++) {
                int number = numbers[i];

                if(number == criteria) break;
                if(i == numbers.length - 1) absenceNumberList.add(criteria);
            }
        }
        return absenceNumberList;
    }
}
