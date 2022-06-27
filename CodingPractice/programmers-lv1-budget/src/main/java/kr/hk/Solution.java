package kr.hk;

import java.util.Arrays;

public class Solution {

    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp = 0;
        Arrays.sort(d);

        for(int num : d) {
            temp += num;
            if(temp > budget) break;
            else if(temp == budget) {
                answer += 1;
                break;
            }
            else answer += 1;
        }

        return answer;
    }

}
