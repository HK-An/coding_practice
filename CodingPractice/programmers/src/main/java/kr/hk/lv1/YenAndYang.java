package kr.hk.lv1;

public class YenAndYang {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] integerArr = new int[absolutes.length];

        for (int i = 0; i < absolutes.length; i++) {
            int number = 0;
            if(signs[i] == true) number = absolutes[i] * 1;
            else number = absolutes[i] * -1;

            integerArr[i] = number;
        }

        for(int number : integerArr) {
            answer += number;
        }
        return answer;
    }
}
