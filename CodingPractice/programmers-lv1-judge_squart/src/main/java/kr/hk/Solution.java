package kr.hk;

public class Solution {
    public long solution(long n) {
        double squart = Math.sqrt(n);

        if(squart == (double)((int)Math.sqrt(n))) return (long) Math.pow(squart+1, 2);
        else return -1;
    }
}
