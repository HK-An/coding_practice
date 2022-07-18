package kr.hk.lv1;

public class WeirdString {
    public String solution(String s) {
        StringBuilder stb = new StringBuilder();
        boolean even = true;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                stb.append(c);
                even = true;
            }
            else if(c != ' ' && even) {
                stb.append(String.valueOf(c).toUpperCase());
                even = false;
            } else if(c != ' ' && even == false) {
                stb.append(String.valueOf(c).toLowerCase());
                even = true;
            }
        }

        return stb.toString();
    }

}