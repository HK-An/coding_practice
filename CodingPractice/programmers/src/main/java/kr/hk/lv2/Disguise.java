package kr.hk.lv2;

import java.util.*;

public class Disguise {

    public int solution(String[][] clothes) {
        Map<String, List<String>> clothesMap = getMap(clothes);

        int answer = 0;
        for(String key : clothesMap.keySet()) {
            List<String> itemList = clothesMap.get(key);
            if(answer ==0 ) answer += (1 + itemList.size());
            else answer *= (1 + itemList.size());
        }
        return answer - 1;
    }

    Map<String, List<String>> getMap(String[][] clothes) {
        Map<String, List<String>> clothesMap = new HashMap<>();

        for(String[] gear : clothes) {
            String key = gear[1];
            String name = gear[0];

            List<String> list = clothesMap.getOrDefault(key, null);
            if(list == null) {
                list = new ArrayList<>();
            }
            list.add(name);

            clothesMap.put(key, list);
        }

        return clothesMap;
    }
}
