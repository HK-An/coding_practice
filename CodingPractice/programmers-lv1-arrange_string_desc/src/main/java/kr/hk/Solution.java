package kr.hk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public String solution(String s) {
        StringBuilder stb = new StringBuilder();
        List<Character> strCharArr = getCharList(s);
        Object[] arr = strCharArr.stream().sorted(Comparator.reverseOrder()).toArray();

        for(Object c : arr) {
            stb.append((char)c);
        }

        return stb.toString();
    }

    List<Character> getCharList(String str) {
        List<Character> list = new ArrayList<>();
        for(char c : str.toCharArray()) {
            list.add(c);
        }
        return list;
    }
}
