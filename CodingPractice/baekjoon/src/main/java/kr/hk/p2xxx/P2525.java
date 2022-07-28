package kr.hk.p2xxx;


import java.util.Scanner;

public class P2525 {
    public void solution() {
        Scanner sc= new Scanner(System.in);
        String[] now = sc.nextLine().split(" ");
        int h = Integer.parseInt(now[0]);
        int m = Integer.parseInt(now[1]);

        int duration = sc.nextInt();

        h += duration / 60;
        m += duration % 60;

        if(m >= 60) {
            int hours = m / 60;
            h += hours;
            m %= 60;
        }
        if(h >= 24) h %= 24;

        System.out.println(h + " " + m);

    }

    public String solution(String input, int duration) {
        String[] now = input.split(" ");
        int h = Integer.parseInt(now[0]);
        int m = Integer.parseInt(now[1]);

        h += duration / 60;
        m += duration % 60;

        if(m >= 60) {
            int hours = m / 60;
            h += hours;
            m %= 60;
        }
        if(h >= 24) h %= 24;

        return h + " " + m;

    }
}
