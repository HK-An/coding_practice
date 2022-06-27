package kr.hk;

import java.util.Arrays;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] sieve = new boolean[n+1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for(int i = 2; i < Math.sqrt(n) + 1; i++) {
            if(sieve[i] == true) {
                for( int j = i * 2; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        for(boolean flag : sieve) {
            if(flag) answer += 1;
        }

        return answer;
    }
}
