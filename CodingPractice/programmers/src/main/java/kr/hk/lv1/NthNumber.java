package kr.hk.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NthNumber {

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<Integer>();
        for(int[] command : commands) {
            int start = command[0] - 1;
            int end = command[1] - 1;
            int address = command[2] - 1;

            int[] splitedAndSortedArray = Arrays.stream(splitArray(array, start, end)).sorted().toArray();
            answerList.add(splitedAndSortedArray[address]);
        }
        return getIntArrayFromList(answerList);
    }

    int[] splitArray(int[] array, int start, int end) {
        List<Integer> splitedNumList = new ArrayList<Integer>();

        for(int i = 0; i < array.length; i++) {
            if(i >= start && i <= end) splitedNumList.add(array[i]);
        }
        return getIntArrayFromList(splitedNumList);
    }

    private int[] getIntArrayFromList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
