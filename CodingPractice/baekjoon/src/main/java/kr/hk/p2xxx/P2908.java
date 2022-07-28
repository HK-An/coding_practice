package kr.hk.p2xxx;

import java.util.Scanner;

public class P2908 {
    /*
    아이디어
    1. 두 수를 String으로 입력받는다.
    2. str size부터 0 까지 역행하는 반복문을 사용하여 뒤집힌 값을 구한다.
    3. 구한 후에 정수형으로 만들어 최댓값을 구한다.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbersStr = sc.nextLine().split(" ");
        int[] numbers = new int[2];


        for(int j = 0; j < 2; j++) {
            String number = numbersStr[j];
            StringBuilder sb = new StringBuilder();
            for(int i = 2; i >= 0; i--) {
                sb.append(number.charAt(i));
            }
            numbers[j] = Integer.parseInt(sb.toString());
        }

        System.out.println(Math.max(numbers[0], numbers[1]));
    }
}
