package algorithm.implement;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {
    
    /*
    * 물건의 가격 price와 지불한 금액 paid가 주어질때, 가장 적은 수의 거스름돈(동전)을 주는 방법
    * {500원갯수, 100원갯수, 50원갯수, 10원갯수} 리턴
    * */
    public int[] changes(int price, int paid) {
        int change = paid - price;
        int[] coins = {500, 100, 50, 10};
        int[] answer = new int[4];

        for(int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            if(change / coin >= 1) {
                int num = change / coin;
                change -= num * coin;
                answer[i] = num;
            }
        }
        return answer;
    }

    /*
    * {{시작시간,종료시간}, {시작시간,종료시간}, ...}의 배열 classes 가 주어질 때
    * 작성할 수 있는 시간표 중에 가장 많은 수업의 갯수를 리턴
    * */
    public int timetable(int[][] classes) {
        Arrays.sort(classes, Comparator.comparingInt(num -> num[1]));
        int endTime = 0;
        int number = 0;

        for(int[] lecture : classes) {
            if(lecture[0] > endTime && endTime < lecture[1]) {
                endTime = lecture[1];
                number += 1;
            }
        }
        return number;
    }

}
