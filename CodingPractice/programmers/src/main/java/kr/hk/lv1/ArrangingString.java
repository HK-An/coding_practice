package kr.hk.lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrangingString {
    public String[] solution(String[] strings, int n) {
        List<String> answerList = new LinkedList<>();

        char[] charArr = getCharArr(strings, n);
        Arrays.sort(strings);

        for(char c : charArr) {
            for(int i = 0; i < strings.length; i++) {
                String str = strings[i];
                if(str == null) continue;

                if(str.toCharArray()[n] == c) {
                    answerList.add(str);
                    strings[i] = null;
                    break;
                }
            }
        }

        return answerList.toArray(new String[answerList.size()]);
    }

    char[] getCharArr(String[] strings, int n) {
        char[] charArr = new char[strings.length];

        for(int i = 0; i < strings.length; i++) {
            String str = strings[i];
            charArr[i] = str.toCharArray()[n];
        }
        Arrays.sort(charArr);

        return charArr;
    }
}
