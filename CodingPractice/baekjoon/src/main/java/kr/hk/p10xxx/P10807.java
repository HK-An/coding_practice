package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10807 {
    /*
    자료구조
    N-> 1<= N <= 100   : int 가능
    numbers[i], v -> -100 <= item <= 100   :  int 가능

    시간복잡도
    반복문을 정렬없이 단순 순회함
    O(N)  N = 100


    아이디어
    1. 입력: 정수의개수(int N), 입력받은수열(int[] numbers), 찾으려는정수(int target)
    2. N크기의 배열 numbers를 선언하여 각 수를 입력받아 저장한다.
    3. 배열을 순회하며 해당 수가 있을 경우 count++
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int target  = Integer.parseInt(st.nextToken()); // 여기까지 입력

        int answer = 0;
        for(int number : numbers) {
            if(target == number) answer++;
        }

        System.out.println(answer);
    }
}
