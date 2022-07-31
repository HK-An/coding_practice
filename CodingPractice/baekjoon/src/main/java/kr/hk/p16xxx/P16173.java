package kr.hk.p16xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/submit/16173/46967972
* #구현 #그래프이론 #브루트포스 #그래프탐색 #너비우선탐색 #깊이우선탐색
*
* 접근
* 1. 너비우선탐색 문제를 풀고싶어서 시작한 문제라서 최초에는 너비우선탐색으로 접근하려했음
* 2. bfs방식으로 접근하려면 배열의 형태를 포기하고 큐의 형태로 접근하여야하는데 그렇게 되면 해당 위치에 있는 이동거리 계산이 힘들어짐
* 3. 다른방법 중 dfs방식의 재귀함수 호출로 접근함
* 4. 어차피 x+n 혹은 y+n 방향으로만 이동하므로 굳이 방문여부를 체크할 필요도 없음
*
* 시도
* 1. 위의 [접근]에서 언급한 방식으로 제출하였으나 시간초과발생
* 2. 이동거리가 0일때 고려를 안한것 같아 0일때 false를 리턴하는 처리 추가 -> 성공
*
* 한계
* 1. 통과는 했지만 중간에 쩰리가 방향을 바꿀수 있다면 올바른 답이 나오지 않을 수 있음.
* 2. 만약 그렇게 된다면 x나 y에 특정 값을 더하는게 1씩 증가해서 모든 경우의 수를 다 찾아봐야 할 것임..
* 3. 그런데 그렇게 되면 시간복잡도가 무한에 수렴하게 될수도 있을것같다.
* */
public class P16173 {
    /*
    아이디어
    1. 입력:  맵의크기(int size) | size*(size * int jump)
    2. [0][0]에서 시작한다.
    3. 현재 위치의 jump를 가져와  x+=jump y+=jump를 해본다.
    4. if(x <= size) x축이동
    5. if(y <= size) y축이동
    6. 현재값이 -1이면 true관련 출력
    7. 다 이동해도 안되면 false 관련 출력

    변수
    int[][] map = new int[size][size]
    int jump (0<=jump<=100)

    시간복잡도


    */
    static int[][] map;
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        map = new int[size][size];

        for(int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j <size; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 여기까지 입력

        if(dfs(0, 0)) System.out.println("HaruHaru");
        else System.out.println("Hing");
    }

    static boolean dfs(int x, int y) {
        int jump = map[y][x];
        int newX = x + jump;
        int newY = y + jump;

        if(jump == -1) return true;
        if(jump == 0) return false;

        boolean result = false;
        if(newX < size) result = result || dfs(newX, y);
        if(newY < size) result = result || dfs(x, newY);

        return result;
    }
}
