package kr.hk;

public class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        long answer = 0;

        for(int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }

        long remains = money - totalPrice;
        answer = remains > 0 ? 0 : Math.abs(remains);
        return answer;
    }
}
