package kr.hk.number;

public class EuclideanAlgorithm {

    public int getGcd(int a, int b) {
        int num1 = Math.max(a, b);
        int num2 = Math.min(a, b);
        int gcd = -1;

        while(true) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            if(remainder == 0) {
                gcd = num2;
                break;
            }

            num1 = quotient;
            num2 = remainder;
        }

        return gcd;
    }

    public int getLcm(int a, int b) {
        int gcd = getGcd(a, b);
        return a * b / gcd;
    }
}
