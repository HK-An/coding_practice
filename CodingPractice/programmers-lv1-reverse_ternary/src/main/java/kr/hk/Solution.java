package kr.hk;

public class Solution {
    public int solution(int n) {
        int biggestPlaceValue = getBiggestPlaceValue(n);
        String ternary = getTernary(biggestPlaceValue, n).toString();
        return getDecimal(ternary);
    }

    int getDecimal(String ternary) {
        int idx = 0;
        int decimal = 0;

        for(char c : ternary.toCharArray()) {
            int digit = Integer.parseInt(c + "");
            decimal += (int)Math.pow(3, idx) * digit;
            idx += 1;
        }

        return decimal;
    }

    StringBuilder getTernary(int biggestPow, int n) {
        StringBuilder stb = new StringBuilder();
        for(int i = biggestPow; i >= 0; i--) {
            int num = n / (int)Math.pow(3, i);
            n = n - (int)Math.pow(3, i) * num;
            stb.append(num);
        }

        return stb;
    }

    int getBiggestPlaceValue(int n) {
        int biggestPlaceValue = 0;

        for(int i = 0; i <= n; i++) {
            if(n < Math.pow(3, i)) {
                biggestPlaceValue = i - 1;
                break;
            }
        }

        return biggestPlaceValue;
    }
}
