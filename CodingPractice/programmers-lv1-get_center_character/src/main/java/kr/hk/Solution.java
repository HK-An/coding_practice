package kr.hk;

public class Solution {
    public String solution(String s) {
        String answer = "";
        int length, half;


        length = s.length();
        char[] arrS = new char[length];
        for(int i=0; i<s.length(); i++){
            arrS[i] = s.charAt(i);
        }

        if(length % 2 == 0){
            half = length / 2 -1;
            answer = Character.toString(arrS[half]) + Character.toString(arrS[half+1]);
        }
        else {
            half = length / 2;
            answer = Character.toString(arrS[half]);
        }
        return answer;
    }
}
