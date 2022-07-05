package kr.hk.lv2;

public class WeirdNumber {
    StringBuilder sb = new StringBuilder();
    public String solution(int n) {
        divide(n);
        return sb.reverse().toString();
    }

    void divide(int number) {
        int quotient = number / 3;
        int remainder = number % 3;
        sb.append(getWeirdNumber(remainder));

        if(remainder == 0) quotient--;
        if(quotient == 0) return;

        divide(quotient);

    }

    int getWeirdNumber(int num) {
        if (num == 0) return 4;
        return num;
    }
}
