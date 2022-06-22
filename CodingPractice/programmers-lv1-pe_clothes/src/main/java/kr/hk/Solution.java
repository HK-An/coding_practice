package kr.hk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] sortedLost = Arrays.stream(lost).sorted().toArray();
        int[] sortedReserved = Arrays.stream(reserve).sorted().toArray();

        Map<Integer, Integer> uniformMap = getUniformMap(n, sortedLost, sortedReserved);
        return uniformMap.keySet().size();
    }

    Map<Integer, Integer> getUniformMap(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> uniformMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            uniformMap.put(i + 1, 1);
        }

        for(int num : reserve) {
            uniformMap.put(num, 2);
        }

        uniformMap = steal(uniformMap, lost);
        uniformMap = borrow(uniformMap, lost);

        return uniformMap;
    }

    private Map<Integer, Integer> borrow(Map<Integer, Integer> uniformMap, int[] lost) {
        for(int number : lost) {
            if( number > 1) {
                int prevNumber = number - 1;
                int uniformPrev = uniformMap.getOrDefault(prevNumber, 0);
                if(uniformPrev == 2) {
                    uniformMap = borrowFrom(number, prevNumber, uniformMap);
                    continue;
                }
            }
            if( number <= uniformMap.size()) {
                int nextNumber = number + 1;
                int uniformNext = uniformMap.getOrDefault(nextNumber, 0);
                if(uniformNext == 2) {
                    uniformMap = borrowFrom(number, nextNumber, uniformMap);
                    continue;
                }
            }
        }
        return uniformMap;
    }

    private Map<Integer, Integer> borrowFrom(int lost, int  target, Map<Integer, Integer> uniformMap) {
        uniformMap.put(lost, 1);
        uniformMap.put(target, 1);

        return uniformMap;
    }

    private Map<Integer, Integer> steal(Map<Integer, Integer> uniformMap, int[] lost) {
        for(int number : lost) {
            int uniform = uniformMap.get(number);

            if(uniform == 1) uniformMap.remove(number);
            else uniformMap.put(number, 1);
        }

        return uniformMap;
    }
}
