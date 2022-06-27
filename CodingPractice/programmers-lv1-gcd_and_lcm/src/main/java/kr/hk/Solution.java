package kr.hk;

public class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(n, m);
        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }

    int getGcd(int n, int m) {
        int gcd = 0;
        int temp1 = Math.max(n,m);
        int temp2 = Math.min(n,m);
        while(true) {
            int mod = temp1 % temp2;
            if(mod == 0) {
                gcd = temp2;
                break;
            }
            else {
                temp1 = temp2;
                temp2 = mod;
            }
        }
        return gcd;
    }
}
