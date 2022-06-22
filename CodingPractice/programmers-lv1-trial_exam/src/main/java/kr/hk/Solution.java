package kr.hk;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answerList = new ArrayList<>();
        int[] studentOneAnswers = {1,2,3,4,5};
        int[] studentTwoAnswers = {2,1,2,3,2,4,2,5};
        int[] studentThreeAnswers = {3,3,1,1,2,2,4,4,5,5};

        int scoreOfOne = countStudentScore(answers, studentOneAnswers);
        int scoreOfTwo = countStudentScore(answers, studentTwoAnswers);
        int scoreOfThree = countStudentScore(answers, studentThreeAnswers);

        int max = Math.max(scoreOfOne, Math.max(scoreOfTwo, scoreOfThree));
        if(max == 0) return new int[]{};

        if(max == scoreOfOne) answerList.add(1);
        if(max == scoreOfTwo) answerList.add(2);
        if(max == scoreOfThree) answerList.add(3);

        return answerList.stream().mapToInt(n->n).toArray();
    }

    int countStudentScore(int[] answers, int[] studentAnswers) {
        int count = 0;

        for(int i=0; i < answers.length; i++) {
            if(studentAnswers[i % studentAnswers.length] == answers[i])
                count += 1;
        }
        return count;
    }
}
