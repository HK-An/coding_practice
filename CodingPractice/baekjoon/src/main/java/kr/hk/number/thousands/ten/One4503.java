package kr.hk.number.thousands.ten;

public class One4503 {
    final int NORTH = 0;
     final int EAST = 1;
     final int SOUTH = 2;
     final int WEST = 3;

     int height;
     int width;
     int robotX;
     int robotY;
     int direction;
     int answer = 0;
     int[][] room;
     boolean[][] visited;

    public  int main(String[] args)  {
        String[] line = args[0].split(" ");
        height = Integer.parseInt(line[0]);
        width = Integer.parseInt(line[1]);
        line = args[1].split(" ");
        robotX = Integer.parseInt(line[0]);
        robotY = Integer.parseInt(line[1]);
        direction = Integer.parseInt(line[2]);
        room = new int[height][width];
        visited = new boolean[height][width];
//        visited[robotY][robotX] = true;

        for(int i =0; i < height; i ++) {
            line = args[i+2].split(" ");
            for(int j = 0; j<width; j++) {
                room[i][j] = Integer.parseInt(line[j]);
            }
        }
        boolean working = true;
        //int count = 0;
        while(working) {
            working = move();
            //count++;
            //if(count == height * width) break;
        }
        answer = answer == 0 ? 1 : answer;
        return answer;
    }

     boolean move() {
     System.out.println("now->" + robotX + " " + robotY);
        if(robotX == 0 || robotY == 0 || robotX == width-1 || robotY == height-1) return false;
        boolean flag = true;
        int[] left;
        int[] back;
        if(direction == NORTH) {
            left = new int[]{robotX-1, robotY};
            back = new int[]{robotX, robotY-1};
            direction = WEST;
        }
        else if(direction == WEST) {
            left = new int[]{robotX, robotY+1};
            back = new int[]{robotX+1, robotY};
            direction = SOUTH;
        }
        else if(direction == SOUTH) {
            left = new int[]{robotX+1, robotY};
            back = new int[]{robotX, robotY-1};
            direction = EAST;
        }
        else {
            left = new int[]{robotX, robotY-1};
            back = new int[]{robotX-1, robotY};
            direction = NORTH;
        }

        if(visited[left[1]][left[0]] == false && room[left[1]][left[0]] == 0 && visited[robotY][robotX] == false) {
            robotX = left[0];
            robotY = left[1];
            visited[robotY][robotX] = true;
            answer++;

        } else if(canProcess() == false && room[back[1]][back[0]] == 1) {
            flag = false;
        } else if(canProcess() && needGoBack()) {
            robotX = back[0];
            robotY = back[1];
        }

        return flag;
    }

    boolean needGoBack() {
        int[] dx;
        int[] dy;
        boolean result = false;
        // n: [0,-1] s: [0,1] w:[-1,0] e:[1,0]
        if(direction == NORTH) {
            dx = new int[]{0,-1,1};
            dy = new int[]{-1,0,0};
        } else if(direction == WEST) {
            dx = new int[]{-1,0,0};
            dy = new int[]{0,1,-1};
        } else if(direction == SOUTH) {
            dx = new int[]{0,1,-1};
            dy = new int[]{1,0,0};
        } else {
            dx = new int[]{1,0,0};
            dy = new int[]{0,-1,1};
        }

        for(int i = 0; i < 3; i++) {
            int nx = robotX + dx[i];
            int ny = robotY + dy[i];

            if(room[ny][nx] == 0 && visited[ny][nx] == false) return false;
        }
        return true;
    }

     boolean canProcess() {
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};
        boolean result = false;

        for(int i = 0; i < 4; i++) {
            int nx = robotX + dx[i];
            int ny = robotY + dy[i];

            if(room[ny][nx] == 0 || visited[ny][nx] == false) {
                result = true;
                break;
            }
        }
        return result;
    }

}
