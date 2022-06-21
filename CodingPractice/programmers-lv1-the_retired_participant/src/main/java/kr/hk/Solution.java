package kr.hk;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();

        for(String name : participant) {
            if(participantMap.containsKey(name)) {
                int cnt = participantMap.get(name);
                participantMap.put(name, cnt + 1);
            } else {
                participantMap.put(name, 0);
            }
        }

        for(String name : completion) {
            int cnt = participantMap.get(name);

            if(cnt == 0) participantMap.remove(name);
            else participantMap.put(name, cnt - 1);
        }

        String keyset = participantMap.keySet().toString();

        return keyset.substring(1, keyset.length() -1);
    }

}
