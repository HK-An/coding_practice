package kr.hk.p10xxx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P10699 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
