package kr.hk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 0 || arr.length == 1) return new int[]{-1};
        List<Integer> numberList = new ArrayList<>();
        int[] tempArr = Arrays.copyOf(arr, arr.length);

        Arrays.sort(tempArr);
        int smallest = tempArr[0];

        for(int number : arr) {
            if(number != smallest) numberList.add(number);
        }
        return numberList.stream().mapToInt(n->n).toArray();
    }
}
