package kr.hk.lv1;

public class GapNumbers {
    public long[] solution(int x, int n) {
        if(n == 0) return new long[]{};
        long[] answer = new long[n];
        long temp = x;

        for(int i = 0; i < n; i++) {
            answer[i] = temp;
            temp += x;
        }
        return answer;
    }
}
