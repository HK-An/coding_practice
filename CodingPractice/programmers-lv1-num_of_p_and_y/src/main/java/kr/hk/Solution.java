package kr.hk;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int numOfP = getNumberOfCharacter(s, 'p');
        int numOfY = getNumberOfCharacter(s, 'y');

        if(numOfP != numOfY) answer = false;

        return answer;
    }

    int getNumberOfCharacter(String str, char target) {
        int number = 0;
        String lowerCaseStr = str.toLowerCase();

        for(char c : lowerCaseStr.toCharArray()) {
            if(c == target) number += 1;
        }

        return number;
    }
}
