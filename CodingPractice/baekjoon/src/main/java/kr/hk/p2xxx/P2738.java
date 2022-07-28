package kr.hk.p2xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2738 {
    /*
    아이디어
    1. 입력: 행렬의높이(int h), 행렬의너비(int w), 행렬1(int[][] arr1)
    2. 한 라인씩 입력받는다.
    3. 줄 입력을 h번 하면 다음 수열로 넘어간다.
    4. 수열을 순회하며 같은 위치에 있는 값을 더한다음에 sb에 저장한다.
    5. 라인이 끝나면 \n을 추가

    자료구조
    h: h<100 => int
    w: w<100 => int
    item = arr[i]: Math.abs(item) <= 100    => int

    시간복잡도
    insert elemet arr1 => O(h*w) = O(1E4)
    get sum of arr1 and arr2 => O(1E4)

    result = O(1E8)
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[h][w];
        int[][] arr2 = new int[h][w];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < w; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 여기까지 입력

        for(int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < w; j++) {
                int sum = arr1[i][j] + Integer.parseInt(st.nextToken()); // 같은 위치에 있는 값을 더함
                sb.append(sum + " ");
            }
            sb.deleteCharAt(sb.length()-1); // 해당 행의 마지막이었으면 공백 삭제
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1); // 마지막의 개행문자 처리
        System.out.println(sb.toString());
    }
}
