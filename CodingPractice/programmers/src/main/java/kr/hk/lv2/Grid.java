package kr.hk.lv2;

public class Grid {
    public long solution(int w, int h) {
        long lw = (long)w;
        long lh = (long)h;
        long gcd = getGcd(lw, lh);
        return (lw*lh) - (lw+lh-gcd);
    }

    long getGcd(long lw, long lh) {
        long num1 = Math.max(lw, lh);
        long num2 = Math.min(lw, lh);
        long gcd = -1;

        while(true) {
            long remainders = num1 % num2;
            if(remainders == 0) {
                gcd = num2;
                break;
            }

            num1 = num2;
            num2 = remainders;
        }

        return gcd;
    }
}
