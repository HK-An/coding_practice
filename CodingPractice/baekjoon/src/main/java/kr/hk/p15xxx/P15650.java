package kr.hk.p15xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/15650
* #백트래킹
*
* 걸린시간 > 30m
* 백트래킹 문제를 풀기 위해서 접근한 문제이다.
* 최초에 접근은 잘 했으나, 자연수범위라는 것에 집착해서 시작을 모두 1부터 하는 바람에 중복된 수열이 존재한것을 뒤늦게 발견했다.
* 중복처리에 대하여 배열에 넣고 비교해보는등 고려를 해보았으나 그러면 너무 복잡해질것같아서
* 시간내에 자력으로 푸는걸 포기하고 검색을 해봤는데
* 간단하게 dfs 탐색에서 반복문의 시작을 1에서 하는것이 아닌, 현재 위치에서 하는것으로 간단하게 해결할 수 있었다.
* 그리고 위의 과정이 있으므로 사실 visited 배열은 필요하지 않다는 것도 알았다.
*
* */

public class P15650 {
    /*
    아이디어
    1. 입력: int max, int size
    2. dfs로 푼다. 인수(아이템개수, 현재위치)
    3. 만약 현재 아이템개수==max라면 출력한다.
    3. 현재 위치 방문처리
    4. list에 값 추가
    5. 3번이동
    6. dfs처리 끝나면 마지막 아이템 제거
    7. 현재 미방문으로 변경

    변수
    boolean[] visited
    List items -> 저장용
    int max
    int size

    시간복잡도

    */
    static boolean[] visited;
    static List<Integer> items = new ArrayList<>();
    static int max;
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        max = Integer.parseInt(st.nextToken());
        size = Integer.parseInt(st.nextToken());

        visited = new boolean[max+1];

        process(0, 1);
    }

    static void process(int itemCount, int start) {
        if(itemCount == size) {
            for(int i = 0; i < size; i++) {
                if(i == size-1) System.out.println(items.get(i));
                else System.out.print(items.get(i) + " ");
            }
            return;
        }

        for(int i = start; i <= max; i++) {
            if(visited[i] == true) continue;

            items.add(i);
            visited[i] = true;
            process(itemCount+1, i);
            items.remove(items.size()-1);
            visited[i] = false;
        }
    }
}
