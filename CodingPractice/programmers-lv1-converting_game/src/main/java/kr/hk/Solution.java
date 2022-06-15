package kr.hk;

public class Solution {

    public int solution(String s) {
        char[] sCharArray = s.toCharArray();

        String answerAsString = getAnswer(sCharArray);
        return Integer.parseInt(answerAsString);
    }

    String getAnswer(char[] strCharArray) {
        StringBuilder answerStrBuilder = new StringBuilder();
        StringBuilder tempStrBuilder = new StringBuilder();

        for(char c : strCharArray) {
            if(isNumber(c)) {
                answerStrBuilder.append(c);
            } else {
                tempStrBuilder.append(c);
                if(isNumber(tempStrBuilder.toString())) {
                    int numFromStr = convertToNumFromString(tempStrBuilder.toString());
                    answerStrBuilder.append(numFromStr);
                    tempStrBuilder = new StringBuilder();
                }
            }
        }
        return answerStrBuilder.toString();
    }

    boolean isNumber(char c) {
        if(c > 47 && c < 58) return true;
        return false;
    }

    boolean isNumber(String s) {
        s = s.toUpperCase();
        if(s.equals(Number.ZERO.toString()) || s.equals(Number.ONE.toString()) || s.equals(Number.TWO.toString()) || s.equals(Number.THREE.toString())
                || s.equals(Number.FOUR.toString()) || s.equals(Number.FIVE.toString())|| s.equals(Number.SIX.toString())
                || s.equals(Number.SEVEN.toString()) || s.equals(Number.EIGHT.toString()) || s.equals(Number.NINE.toString())) return true;
        else return false;
    }

    int convertToNumFromString(String s) {
        s = s.toUpperCase();
        if(s.equals(Number.ZERO.toString())) return 0;
        else if(s.equals(Number.ONE.toString())) return 1;
        else if(s.equals(Number.TWO.toString())) return 2;
        else if(s.equals(Number.THREE.toString())) return 3;
        else if(s.equals(Number.FOUR.toString())) return 4;
        else if(s.equals(Number.FIVE.toString())) return 5;
        else if(s.equals(Number.SIX.toString())) return 6;
        else if(s.equals(Number.SEVEN.toString())) return 7;
        else if(s.equals(Number.EIGHT.toString())) return 8;
        else if(s.equals(Number.NINE.toString())) return 9;

        return -1;
    }

    enum Number {
        ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);

        private int number;

        Number(int number) {
            this.number = number;
        }
    }
}
