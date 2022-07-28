package kr.hk.stage.two;

import kr.hk.stage.kr.hk.Common;

public class ThreeDices extends Common {
    public void solution() {
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        if(d1 == d2 && d2 == d3) System.out.println(10000 + d1 * 1000);
        else if(d1 == d2 && d2 != d3) System.out.println(getSecondPrize(d1));
        else if(d1 == d3 && d1 != d2) System.out.println(getSecondPrize(d1));
        else if(d2 == d3 && d1 != d2) System.out.println(getSecondPrize(d2));
        else System.out.println(Math.max(d1, Math.max(d2, d3)) * 100);
    }

    String getSecondPrize(int num) {
        return 1000 + num * 100 + "";
    }
}
