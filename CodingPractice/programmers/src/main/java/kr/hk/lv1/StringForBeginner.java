package kr.hk.lv1;

public class StringForBeginner {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6) return false;

        char[] strCharArr = s.toCharArray();

        for(char c : strCharArr) {
            if(c < 48 || c > 57) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
