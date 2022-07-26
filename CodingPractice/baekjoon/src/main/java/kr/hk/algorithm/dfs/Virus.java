package kr.hk.algorithm.dfs;

import java.io.IOException;

public class Virus  {

    boolean[] visited;
    boolean[][] fromTo;
    int count = 0;

    int solution(String[] args) throws IOException {
        int numberOfVertexes = Integer.parseInt(args[0]);
        int numberOfEdges = Integer.parseInt(args[1]);

        fromTo = new boolean[numberOfVertexes+1][numberOfVertexes+1];
        visited = new boolean[numberOfVertexes +1];

        for(int i = 0; i<numberOfEdges; i++) {
            String[] line = args[i+2].split(" ");
            int from = Integer.parseInt(line[0]);
            int to = Integer.parseInt(line[1]);

            fromTo[from][to] = true;
            fromTo[to][from] = true;
        }
        dfs(1);
        return count;
    }

    void dfs(int num) {
        // num에 연결되어 있는걸 확인하기 위하여 배열을 탐색
        visited[num] = true;

        for(int i = 1; i < visited.length; i++) {
            if(fromTo[num][i] == true && visited[i] == false) {
                count++;
                dfs(i);
            }
        }
    }
}
