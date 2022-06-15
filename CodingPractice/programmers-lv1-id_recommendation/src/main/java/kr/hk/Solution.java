package kr.hk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String new_id) {
        String answer = "";

        // stage 1 : all alphabet should be lowercase
        List<Character> newIdCharList = idToLowerCase(new_id);

        // stage 2 : only a-z, number, -, .
        newIdCharList = restrictCharater(newIdCharList);

        // stage 3 : .. -> .
        newIdCharList = onlySingleCascadeDot(newIdCharList);

        // stage 4 : The dot should not located first and last
        newIdCharList = removeDotFirstAndLast(newIdCharList);

        // stage 5 : if id is empty then put "a"
        newIdCharList = setDefaultIsEmpty(newIdCharList);

        // stage 6 : id length < 16, not end with '.'
        newIdCharList = regulateIdLength(newIdCharList);

        // stage 7 : id length < 3, then add last char to length >2
        newIdCharList = addLastCharIfShort(newIdCharList);

        // set answer
        answer = charListToStr(newIdCharList);

        return answer;
    }

    private String charListToStr(List<Character> charList) {
        return charList.stream()
                .map(c -> c.toString())
                .reduce((acc, e) -> acc + e)
                .get();
    }


    private List<Character> addLastCharIfShort(List<Character> charList) {
        while(true) {
            if(charList.size() < 3) {
                charList.add(charList.get(charList.size()-1));
            } else break;

        }
        return charList;
    }

    private List<Character> regulateIdLength(List<Character> charList) {
        if(charList.size() > 15) {
            String str = charListToStr(charList);
            charList = str.substring(0, 15).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        }
        charList = removeDotLast(charList);
        return charList;
    }
    private List<Character> setDefaultIsEmpty(List<Character> charList) {
        if(charList.size() == 0) charList.add('a');
        return charList;
    }

    private List<Character> removeDotFirstAndLast(List<Character> charList) {

        if (charList.get(0) == '.') charList.remove(0);
        charList = removeDotLast(charList);

        return charList;
    }

    private List<Character> removeDotLast(List<Character> charList) {
        int listSize = charList.size();

        if (listSize == 0) return charList;
        if (charList.get(listSize - 1) == '.') charList.remove(listSize - 1);

        return charList;
    }

    private List<Character> onlySingleCascadeDot(List<Character> charList) {
        List<Character> newList = new ArrayList<>();

        for (int i = 0; i < charList.size(); i++) {
            if (i == 0) {
                newList.add(charList.get(i));
            } else if (charList.get(i) == '.' && charList.get(i - 1) == '.') {
                continue;
            } else {
                newList.add(charList.get(i));
            }
        }

        return newList;
    }

    private List<Character> restrictCharater(List<Character> newIdCharList) {
        List<Character> newCharList = new ArrayList<>();

        for (char c : newIdCharList) {
            if ((c > 96 && c < 123) == true || (c > 47 && c < 58) || c == '-' || c == '.' || c == '_') {
                newCharList.add(c);
            }
        }

        return newCharList;
    }

    private List<Character> idToLowerCase(String id) {
        return id.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }
}
