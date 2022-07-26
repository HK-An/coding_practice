package kr.hk.stage.two;


import java.util.Scanner;

public class AlarmClock  {

    public void solution() {
        Scanner sc= new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int newMinutes = m-45;
        int newHours = 0;

        if(newMinutes < 0) {
            newHours = h - 1;
            newMinutes = newMinutes + 60;
        }
        if(newHours < 0) {
            newHours = 23;
        }

        System.out.println(newHours + " " + newMinutes);
    }

    public String solution(int h, int m) {
        int newMinutes = m-45;
        int newHours = 0;

        if(newMinutes < 0) {
            newHours = h - 1;
            newMinutes = newMinutes + 60;
        }
        if(newHours < 0) {
            newHours = 23;
        }

        return newHours + " " + newMinutes;
    }
}
