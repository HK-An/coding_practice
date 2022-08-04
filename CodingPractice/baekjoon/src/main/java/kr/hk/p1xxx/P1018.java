package kr.hk.p1xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/1018
*
* 어렵지는 않은데 설명이 명확하지 않아서 이해하는데 오래걸림
* 걸린시간 : 1h
* 
* 실수
* 1. 무조건 0,0을 기준으로 잡아서 하려 했다.
* 2. 처음이 B로 시작하더라도 최소를 구하는 문제이므로 처음자체가 틀렷을 가능성도 있음. 그러므로 64-count도 했어야함
*
* */

public class P1018 {
    /*
    아이디어
    1. 입력: 가로(int width) 세로(int height)  |  height * String line
    2. 각 line을 배열로 만들어서 배열에 입력한다.
    3. 각 로우별 컬럼별로 순회하면서 가장 적은 수를 찾는다.
      3.1. 시작하는 색깔을 찾아서 저장한다. (B, W을 true,false로 단순화)
      3.2. 배열을 순회하며 시작색깔을 계속 역전시킨다.
      3.3. 현재 반복수 < width -8이면 다음라인 이동
      3.4. 현재 반복수 < height - 8이면 count가 최소값이면 정답에 저장하고 종료

    변수
    8 <= width, height <= 50    int가능
    String line
    int[][] board = new int[height][width]


    시간복잡도
    배열에 입력: O(height + width) = O(100)
    배열에서 조회: O((height height - 8) * (width + width - 8)) = O(184)
    O(284)
    */

    static char[][] board;
    static int answer = 2500;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        board = new char[height][width];

        for(int i = 0; i < height; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j = 0; j < width; j++) {
                board[i][j] = line.toCharArray()[j];
            }
        } // 여기까지입력

        for(int startY = 0; startY < height - 7; startY++) {
            for(int startX = 0; startX < width - 7; startX++) {
                find(startX, startY);
            }
        }

        System.out.println(answer);
    }

    static void find(int startX, int startY) {
        int endX = startX + 8;
        int endY = startY + 8;

        boolean isBlack = board[startY][startX] == 'B' ? true : false;
        int count = 0;
        for(int y = startY; y < endY; y++) {
            for(int x = startX; x < endX; x++) {
                if(x == startX && y == startY) continue;
                char target = isBlack == true ? 'W' : 'B';
                if(board[y][x] != target) count++;
                isBlack = !isBlack;
            }
            isBlack = !isBlack;
        }
        count = Math.min(count, 64 - count);
        answer = Math.min(answer, count);
    }
}
