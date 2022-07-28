package kr.hk.stage.three;

import kr.hk.stage.kr.hk.Common;

public class TimesTable extends Common {
    public void solution() {
        int number = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
}
