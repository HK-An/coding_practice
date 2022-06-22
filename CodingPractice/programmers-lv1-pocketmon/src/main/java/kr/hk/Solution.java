package kr.hk;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int solution(int[] nums) {
        int numOfChoices = nums.length / 2;
        return getAnswer(numOfChoices, nums);
    }

    int getAnswer(int numOfChoices, int[] nums) {
        long max = Arrays.stream(nums).distinct().count();
        List<Integer> numberList = new LinkedList<>();

        for(int num : nums) {
            if(numberList.contains(num)) continue;

            numberList.add(num);
            if(numberList.size() == max) break;
            if(numberList.size() == numOfChoices) break;
        }

        if(numberList.size() == max) return (int)max;
        else return numberList.size();
    }
}
