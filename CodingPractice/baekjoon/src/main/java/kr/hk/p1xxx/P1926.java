package kr.hk.p1xxx;

import java.io.*;
import java.util.*;

public class P1926 {

    static int width, height;
    static int[][] panel;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();


        panel = new int[height][width];
        visited = new boolean[height][width];

        for(int i=0; i<height; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<width; j++) {
                panel[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int biggest = 0;
        int count = 0;
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++) {
                if(panel[i][j] == 1 && visited[i][j] == false) {
                    biggest = Math.max(biggest, bfs(j, i));
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println(biggest);
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[y][x] = true;
        int size = 1;

        while(queue.isEmpty() == false) {
            int[] item = queue.poll();
            int tx = item[0];
            int ty = item[1];

            for(int i = 0; i < 4; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];

                if((0 <= nx && 0 <= ny) && (nx < width && ny < height)) {
                    if(panel[ny][nx] == 1 && visited[ny][nx] == false) {
                        size++;
                        visited[ny][nx] = true;
                        queue.add(new int[] {nx, ny});
                    }
                }
            }
        }
        return size;
    }

}
