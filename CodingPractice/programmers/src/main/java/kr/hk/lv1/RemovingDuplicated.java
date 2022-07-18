package kr.hk.lv1;

import java.util.ArrayList;
import java.util.List;

public class RemovingDuplicated {
    public int[] solution(int []arr) {
        int[] answer = {};
        int prev = -1;
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(prev != arr[i]) answerList.add(arr[i]);
            prev = arr[i];
        }

        return answerList.stream().mapToInt(n->n).toArray();
    }
}
