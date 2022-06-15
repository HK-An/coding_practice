package kr.hk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionOne {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<Integer>();

        for(int num : arr) {
            if(answerList.size() == 0) {
                answerList.add(num);
                continue;
            }

            int lastItemOfAnswerList = answerList.get(answerList.size() -1);
            if(lastItemOfAnswerList != num) answerList.add(num);

        }
        return answerList.stream().mapToInt(n->n).toArray();
    }
}
