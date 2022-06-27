package kr.hk;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                answerList.add(numbers[i] + numbers[j]);
            }
        }
        return answerList.stream().distinct().sorted().mapToInt(n->n).toArray();
    }
}
