package kr.hk;

public class Solution {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        StringBuilder stb = new StringBuilder();

        for(char c : charArr) {
            if(c == ' ') stb.append(c);
            else stb.append(getPushedChar(c, n));
        }

        return stb.toString();
    }

    char getPushedChar(char c, int buffer) {
        boolean isUpperCase = (64 < c && c < 91) ? true : false;
        char pushed = c;

        for(int i = 1; i < buffer +1; i++) {
            pushed += 1;

            if(isUpperCase && pushed > 90) pushed -= 26;
            else if(isUpperCase == false && pushed > 122) pushed -= 26;
        }

        return pushed;
    }
}
