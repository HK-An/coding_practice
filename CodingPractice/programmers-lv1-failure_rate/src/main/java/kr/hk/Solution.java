package kr.hk;

import java.util.*;

public class Solution {

    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> failureMap = new HashMap<>();

        for(int i = 1; i < N + 1; i++) {
            double failureRate = getFailureRate(i, stages);
            failureMap.put(i, failureRate);
        }

        return getAnswer(failureMap);
    }

    private int[] getAnswer(Map<Integer, Double> failureMap) {
        double[] distinctFailureReversedArr = null;
        List<Double> failureRateList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int key : failureMap.keySet()) {
            failureRateList.add(failureMap.get(key));
        }
        distinctFailureReversedArr = failureRateList.stream().distinct().sorted(Comparator.reverseOrder()).mapToDouble(n->n).toArray();

        for(double rate : distinctFailureReversedArr) {
            for(int key : failureMap.keySet()) {
                if(rate == failureMap.get(key)) answerList.add(key);
            }
        }
        return answerList.stream().mapToInt(n->n).toArray();
    }

    double getFailureRate(int targetStage, int[] stages) {
        int fail = 0;
        int reach = 0;
        for(int stage : stages) {
            if(stage > targetStage) reach += 1;
            else if(stage == targetStage) {
                reach += 1;
                fail += 1;
            }
        }
        if(reach == 0) return 0;
        return  (double)fail/reach;
    }
}
