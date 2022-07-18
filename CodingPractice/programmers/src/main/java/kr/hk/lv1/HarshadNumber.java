package kr.hk.lv1;

public class HarshadNumber {
    public boolean solution(int x) {
        char[] digitCharArray = (x+"").toCharArray();
        int sumOfDigits = 0;

        for(char digit : digitCharArray) {
            String s = String.valueOf(digit);
            int number = Integer.parseInt(s);
            sumOfDigits += number;
        }

        boolean answer = x % sumOfDigits == 0 ? true : false;
        return answer;
    }
}
