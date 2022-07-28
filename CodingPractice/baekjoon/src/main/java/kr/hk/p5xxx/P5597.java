package kr.hk.p5xxx;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P5597 {
    /*
    아이디어
    1. 입력: 출석번호(int number)
    2. int[] students에 number을 입력받아 저장한다.
    3. 입력받은 번호를 정렬한다.
    4. Queue<Integer> studentsQueue에 학생들을 저장한다.
    4. 반복문을 1에서 30까지 순회하며 queue를 peek시키며 해당 숫자가 나오면 poll 나오지 않으면 배열에 저장
    5. 배열을 정렬한 후 출력한다.

    자료구조
    출석번호: 30개 -> int
    출석: Queue<Integer>

    시간복잡도
    입력받는 배열에 저장하는데 O(30)
    q에 저장하는데 O(30)
    안낸사람 찾고 저장하는데 O(30)
   배열 정렬하는데 O(2^2)
   총 O(94)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> studentsQueue = new LinkedList<>();
        int[] students = new int[28];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 28; i++) {
            students[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(students);
        for(int i = 0; i < 28; i++) {
            studentsQueue.add(students[i]);
        }
        int count = 0;
        for(int i = 1; i <= 30; i++) {
            if(count == 2) break;
            if(studentsQueue.size() ==0) {
                sb.append(i + "\n");
                count++;
                continue;
            }
            int number = studentsQueue.peek();

            if(number == i) studentsQueue.poll();
            else {
                sb.append(i + "\n");
                count++;
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
