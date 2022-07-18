package kr.hk.lv1;

public class ReversingNumber {
    public int[] solution(long n) {
        String numberStr = n + "";
        int[] answer = new int[numberStr.length()];
        int idx = 0;
        for(int i = numberStr.length() -1; i >= 0; i--) {
            answer[idx] = Integer.parseInt(numberStr.charAt(i)+"");
            idx += 1;
        }
        return answer;
    }
}
