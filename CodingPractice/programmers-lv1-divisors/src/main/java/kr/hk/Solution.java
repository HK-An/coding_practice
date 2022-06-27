package kr.hk;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {
            if(isDivisorOfNumEven(i) == true) answer += i;
            else answer -= i;
        }
        return answer;
    }

    boolean isDivisorOfNumEven(int number) {
        if(number == 1) return false;
        else if(number == 2) return true;

        int criteria = number / 2;
        int cnt = 1;
        for(int i = 2; i <= criteria; i++) {
            if(number % i == 0) cnt += 1;
        }

        return (cnt + 1) % 2 == 0 ? true : false;
    }
}
