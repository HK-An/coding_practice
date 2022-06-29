package kr.hk;

public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        boolean is31Days = true;
        int days = 5; // 2016.01.01.은 금요일

        for(int i = 1; i <= a; i++) {
            if(i != a && is31Days) {
                days += 31;
                if(i != 7) is31Days = false;
            } else if(i != a && is31Days == false) {
                if(i == 2) days += 29;
                else days += 30;
                is31Days = true;
            }
        }
        days += b - 1;
        answer = getDay(days % 7);

        return answer;
    }
    public String getDay(int date){
        //0일 1월 2화 3수 4목 5금 6토
        switch(date){
            case 0: return "SUN";
            case 1: return "MON";
            case 2: return "TUE";
            case 3: return "WED";
            case 4: return "THU";
            case 5: return "FRI";
            default: return "SAT";
        }
    }
}
