package kr.hk.lv2;

public class ColoringBook {
    private int maxSizeOfArea;
    private int cntOfArea;
    private int temp = 0;
    private int[] dx = {-1,1,0,0};
    private int[] dy = {0,0,-1,1};

    public int[] solution(int m, int n, int[][] picture) {
        cntOfArea = 0;
        maxSizeOfArea = 0;
        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j ++) {
                if(picture[i][j] != 0 && visited[i][j] == false) {
                    cntOfArea += 1;
                    dfs(i,j,picture,visited);
                }
                maxSizeOfArea = Math.max(maxSizeOfArea, temp);
                temp = 0;
            }
        }

        return new int[]{cntOfArea, maxSizeOfArea};
    }

    void dfs(int x, int y, int[][]picture, boolean[][] visited) {
        if(visited[x][y]) return;

        visited[x][y] = true;
        temp += 1;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx > picture.length - 1 || ny < 0 || ny > picture[0].length - 1) continue;

            if(picture[x][y] == picture[nx][ny] && visited[nx][ny] == false) {
                dfs(nx, ny,picture,visited);
            }
        }
    }
}
