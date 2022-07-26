package kr.hk.stage.two;

import kr.hk.Common;

public class AutomatedOven extends Common {
    public void solution() {
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
