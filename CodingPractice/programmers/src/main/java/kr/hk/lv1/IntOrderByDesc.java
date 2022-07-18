package kr.hk.lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntOrderByDesc {
    public long solution(long n) {
        String strNumber = n + "";
        List<Integer> numberCharList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strNumber.length(); i++) {
            numberCharList.add((int) strNumber.charAt(i));
        }

        List<Integer> answerList = numberCharList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for(int number : answerList) {
            sb.append((char)number);
        }
        return Long.parseLong(sb.toString());
    }
}
