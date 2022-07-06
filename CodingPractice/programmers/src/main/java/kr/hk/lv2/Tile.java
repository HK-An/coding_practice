package kr.hk.lv2;

public class Tile {
    public int solution(int n) {
        int num1 = 1;
        int num2 = 2;
        for(int i = 0; i < n/2; i++) {
            if(n % 2 == 0 && n/2 - 1 == i) break;

            int temp = num1;
            num1 = temp + num2;
            num2 = num1 + num2;
        }

        int answer = n % 2 == 0 ? num2 : num1;

        return answer % 1000000007;
    }
}
