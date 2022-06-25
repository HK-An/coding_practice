package kr.hk;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<String> tryList = getToTries(dartResult);
        List<Integer> scoreList = getScoreOnEachTries(tryList);

        for(int score  : scoreList) {
            answer += score;
        }
        return answer;
    }

    List<Integer> getScoreOnEachTries(List<String> tryList) {
        char[] bonuses = {'S', 'D', 'T'};
        int score = 0;
        List<Integer> scoreList = new LinkedList<>();

        for(int i = 0; i < tryList.size(); i++) {
            String trial = tryList.get(i);
            int indexOfBonus = getIndex(trial, bonuses);
            int number = Integer.parseInt(trial.substring(0, indexOfBonus));
            int power = getPower(trial.toCharArray()[indexOfBonus]);
            char option = 0;

            if(trial.length() == 3 && number != 10) option = trial.toCharArray()[indexOfBonus+1];

            score = (int)Math.pow(number, power);

            if(option == '#') score *= -1;
            else if(option == '*') {
                if(scoreList.size() != 0) {
                    int prevScore = scoreList.get(i -1) * 2;
                    scoreList.remove(i-1);
                    scoreList.add(i-1, prevScore);
                }
                score *= 2;
            }

            scoreList.add(score);
        }

        return scoreList;
    }

    int getIndex(String str, char[] charArray) {
        int idx = -1;

        for(char c : charArray) {
            idx = str.indexOf(c);
            if(idx != -1) break;
        }

        return idx;
    }

    List<String> getToTries(String dartResult) {
        List<String> tryList = new ArrayList<>();
        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.toCharArray()[i];
            char nextChar = 0;

            stb.append(c);

            if(i != dartResult.length() - 1) nextChar = dartResult.toCharArray()[i + 1];
            else tryList.add(stb.toString());

            if (c == '1' && nextChar == '0') {
                continue;
            } else if ('0' <= nextChar && nextChar <= '9') {
                tryList.add(stb.toString());
                stb = new StringBuilder();
            }
        }

        return tryList;
    }

    int getPower(char bonus) {
        int power = 1;
        if(bonus == 'D') power = 2;
        else if(bonus == 'T') power = 3;

        return power;
    }
}
