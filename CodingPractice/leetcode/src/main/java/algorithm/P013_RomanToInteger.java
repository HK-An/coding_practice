package algorithm;

/*
* https://leetcode.com/problems/roman-to-integer/
* #HashTable #Math #String
* 4ms(1.72%) 42.6MB(6.4%)
* */
public class P013_RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;

        // I X C는 그 외의 것들의 이전에  -가 됨
        // IIX 8
        // 왼쪽부터 가장 큰 수를 쓴다. 하지만 최대값에서 -1은 앞에 위치한다.
        /*
        1. 차례대로 읽는다
        2. IXC이면 다음걸읽어보고 다음글자가 IXC가 아니면 -을 곱한다.
        3. 다음 수를 더해준다.
        */
        char[] charArr = s.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            int num = 0;
            int mul = 1;

            if(i+1 < charArr.length && isNumberTypeA(c) && isNumberForMinus(c, charArr[i+1])) mul = -1;

            if(c == 'I') num = 1;
            else if(c == 'V') num = 5;
            else if(c == 'X') num = 10;
            else if(c == 'L') num = 50;
            else if(c == 'C') num = 100;
            else if(c == 'D') num = 500;
            else if(c == 'M') num = 1000;

            sum += num * mul;
        }

        return sum;
    }

    boolean isNumberTypeA(char c) { // I X C
        if(c == 'I' || c == 'X' || c == 'C') return true;
        else return false;
    }

    boolean isNumberForMinus(char present, char next) {
        if(present == 'I') {
            if(next == 'V' || next == 'X') return true;
            else return false;
        } else if(present == 'X') {
            if(next == 'L' || next == 'C') return true;
            else return false;
        } else if(present == 'C') {
            if(next == 'D' || next == 'M') return true;
            else return false;
        } else return false;
    }
}
