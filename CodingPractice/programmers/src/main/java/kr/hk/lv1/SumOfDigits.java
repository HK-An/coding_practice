package kr.hk.lv1;

public class SumOfDigits {
    public int solution(int n) {
        String str = n + "";
        int answer = 0;

        for(int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.charAt(i) + "");
        }

        return answer;
    }
}
