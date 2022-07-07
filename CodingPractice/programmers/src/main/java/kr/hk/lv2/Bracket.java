package kr.hk.lv2;

public class Bracket {
    boolean solution(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') count += 1;
            else if(c == ')') count -= 1;

            if(count < 0) break;
        }

        return count == 0;
    }
}
