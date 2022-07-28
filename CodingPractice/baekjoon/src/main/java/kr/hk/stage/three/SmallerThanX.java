package kr.hk.stage.three;

import kr.hk.stage.kr.hk.Common;

public class SmallerThanX extends Common {

    public void solution() {
        int max = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String[] numbersArr = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(String number : numbersArr) {
            if(max > Integer.parseInt(number)) sb.append(number + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public void solution(String firstLine, String str) {
        int max = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String[] numbersArr = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(String number : numbersArr) {
            if(max > Integer.parseInt(number)) sb.append(number + " ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
