package kr.hk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int equalCnt = 0;
        int unRecognizedNumCnt = 0;

        List<Integer> lottoList = Arrays.stream(lottos).sorted().boxed().collect(Collectors.toList());
        List<Integer> winNumList = Arrays.stream(win_nums).sorted().boxed().collect(Collectors.toList());

        for (int myNum : lottoList) {
            if (myNum == 0) {
                unRecognizedNumCnt += 1;
                continue;
            }

            boolean isEqual = Arrays.stream(win_nums).anyMatch(winNum -> winNum == myNum);

            if (isEqual)
                equalCnt += 1;
        }

        answer[0] = winResult(equalCnt + unRecognizedNumCnt);
        answer[1] = winResult(equalCnt);

        return answer;
    }

    private int winResult(int equalCnt) {
        int result = 0;
        switch (equalCnt) {
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            default:
                result = 6;
        }

        return result;
    }
}
