package kr.hk;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        int[] combinedMap = combine(arr1, arr2);

        for(int i = 0; i < combinedMap.length; i++) {
            String strLine = getLineToString(combinedMap[i], combinedMap.length);
            answer[i] = strLine;
        }

        return answer;
    }

    String getLineToString(int line, int size) {
        StringBuilder stb = new StringBuilder();
        char[] binaryArr = Integer.toBinaryString(line).toCharArray();

        for(int i = binaryArr.length; i < size; i++) {
            stb.append(" ");
        }

        for(char digit : binaryArr) {
            if(digit == '0') stb.append(" ");
            else stb.append("#");
        }

        return stb.toString();
    }

    int[] combine(int[] arr1, int[] arr2) {
        int[] combinedMapArr = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++) {
            combinedMapArr[i] = arr1[i] | arr2[i];
        }
        return combinedMapArr;
    }
}
