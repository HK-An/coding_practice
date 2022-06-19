package kr.hk;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int answer = 0;

    public int solution(int[][] board, int[] moves) {

        List<Integer> stack = getDolls(board, moves);
        removeDuplicates(stack);
        return answer;
    }

    boolean isDuplicated(List<Integer> stack) {
        boolean result = false;
        for(int i = 0; i < stack.size(); i++) {
            if(i < 1) continue;

            if(stack.get(i) == stack.get(i - 1)) {
                result = true;
            }
        }

        return result;
    }

    void removeDuplicates(List<Integer> stack) {
        for(int i = 0; i < stack.size(); i++) {
            if(i < 1) continue;

            if(stack.get(i) == stack.get(i - 1)) {
                answer += 2;
                stack.remove(i);
                stack.remove(i - 1);
            }
        }

        if(isDuplicated(stack)) removeDuplicates(stack);
        else return;
    }

    List<Integer> getDolls(int[][] board, int[] moves) {
        List<Integer> stackList = new ArrayList<Integer>();

        for(int line : moves) {
            int column = line - 1;

            for(int[] boardRow : board) {
                if(boardRow[column] != 0) {
                    stackList.add(boardRow[column]);
                    boardRow[column] = 0;
                    break;
                }
            }
        }
        return stackList;
    }

}
