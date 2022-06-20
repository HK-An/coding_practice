package kr.hk;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        List<Integer> integerList = new ArrayList<Integer>();

        for (int i = 0; i < absolutes.length; i++) {
            int number = 0;
            if(signs[i] == true) number = absolutes[i] * 1;
            else number = absolutes[i] * -1;

            integerList.add(number);
        }

        for(int number : integerList) {
            answer += number;
        }
        return answer;
    }

}
