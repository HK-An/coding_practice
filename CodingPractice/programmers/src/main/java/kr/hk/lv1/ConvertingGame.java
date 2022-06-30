package kr.hk.lv1;

public class ConvertingGame {
    private final String ZERO = "zero";
    private final String ONE = "one";
    private final String TWO = "two";
    private final String THREE = "three";
    private final String FOUR = "four";
    private final String FIVE = "five";
    private final String SIX = "six";
    private final String SEVEN = "seven";
    private final String EIGHT = "eight";
    private final String NINE = "nine";
    public int solution(String s) {
        String answerAsString = getAnswer(s);
        return Integer.parseInt(answerAsString);
    }

    String getAnswer(String str) {
        StringBuilder answerStrBuilder = new StringBuilder();
        StringBuilder tempStrBuilder = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
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
        if(c >= '0' && c <= '9') return true;
        return false;
    }

    boolean isNumber(String s) {
        if(s.equals(ZERO) || s.equals(ONE) || s.equals(TWO) || s.equals(THREE)
                || s.equals(FOUR) || s.equals(FIVE)|| s.equals(SIX)
                || s.equals(SEVEN) || s.equals(EIGHT) || s.equals(NINE)) return true;
        else return false;
    }

    int convertToNumFromString(String s) {
        if(s.equals(ZERO)) return 0;
        else if(s.equals(ONE)) return 1;
        else if(s.equals(TWO)) return 2;
        else if(s.equals(THREE)) return 3;
        else if(s.equals(FOUR)) return 4;
        else if(s.equals(FIVE)) return 5;
        else if(s.equals(SIX)) return 6;
        else if(s.equals(SEVEN)) return 7;
        else if(s.equals(EIGHT)) return 8;
        else if(s.equals(NINE)) return 9;

        return -1;
    }
}
