package kr.hk.lv1;

import java.util.ArrayList;
import java.util.List;

public class SumOfDivisors {
    public int solution(int n) {
        int answer = 0;
        if(n == 0) return 0;
        if(n == 1) return 1;
        List<Integer> divisors = getDivisors(n);

        for(int divisor : divisors) {
            answer += divisor;
        }
        return answer;
    }

    List<Integer> getDivisors(int n) {
        List<Integer> divisorList = new ArrayList<>();
        divisorList.add(1);

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(i != Math.sqrt(n)) divisorList.add(n/i);
                divisorList.add(i);
            }
        }
        divisorList.add(n);
        return divisorList;
    }
}
