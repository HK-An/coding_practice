package algorithm.implement.dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

    private boolean[] visited;
    private LinkedList<Integer> neighbour[]; // 인접 리스트
    private int[][] graph;

    // 생성자
    DFS(int[][] graph, int size) {
        this.graph = graph;
        this.visited = new boolean[size];
    }

    // DFS 탐색
    void search(int idx) {
        if(visited[idx]) return; // 이미 탐색한 내용이면 다음으로

        visited[idx] = true; // 탐색처리

        // 탐색후에 해야할 로직 구현
        System.out.println("idx: " + idx);
        // 로직 끝

        for(int node : graph[idx]) {
            if(!visited[node]) {
                search(node);
            }
        }
    }
}


