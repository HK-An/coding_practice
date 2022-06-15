package kr.hk;

public class QuestionTwo {
    public int solution(int[] a, int[] b) {
        int size = a.length;
        int sum = 0;

        for(int i = 0; i < size; i++) {
            int multiple = a[i] * b[i];
            sum = sum + multiple;
        }

        return sum;
    }
}
