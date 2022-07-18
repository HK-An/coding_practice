package kr.hk.lv1;

public class JudgeSquare {
    public long solution(long n) {
        double square = Math.sqrt(n);

        if(square == (double)((int)Math.sqrt(n))) return (long) Math.pow(square +1, 2);
        else return -1;
    }
}
