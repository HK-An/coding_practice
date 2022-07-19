package kr.hk.lv2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BiggestNumber {

    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        List<String> list = Arrays.stream(numbers).mapToObj(Integer::toString).sorted((o1, o2) -> (o2+o1).compareTo(o1+o2)).collect(Collectors.toList());

        for(String s : list) {
            sb.append(s);
        }

        String answer = sb.toString().charAt(0) == '0' ? "0" : sb.toString();

        return answer;
    }

}
