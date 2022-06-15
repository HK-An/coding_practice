package kr.hk;

public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        //0일 1월 2화 3수 4목 5금 6토
        int c = 4;

        switch(a){
            case 1:
                c += b;
                break;

            case 2:
                c = c + b  + 31;
                break;

            default:
                c = calFirstDay(a) + b;
                break;
        }
        answer = whatDay(c);

        return answer;
    }
    public int calFirstDay(int month){
        int day = 1;

        for(int i=4; i<=month; i++){
            if(i <= 7){
                if(i % 2 == 0) { // 30
                    day = day + 3;
                }else { // 31
                    day = day + 2;
                }
            }else{
                if(i == 8 ){
                    day = day + 3;
                }
                else if(i % 2 == 0){
                    day = day +2;
                }else{
                    day = day + 3;
                }
            }
        }
        return day;
    }
    public String whatDay(int date){
        //0일 1월 2화 3수 4목 5금 6토
        int result = date % 7;
        switch(result){
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
