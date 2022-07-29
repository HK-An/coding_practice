package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10250 {
    /*
    아이디어
    1. 입력: 테스트케이스의수(int T) | T * (호텔의층수(int H) 각층의방수(int W) 손님수(int N))
    2. t번 반복하며 입력을 받는다.
    3. boolean[][] hotel = new boolean[H+1][W+1]; 0주소는 편의를 위하여 버린다.
    4. 층을 우선으로 탐색하여 출력

    자료구조
    boolean[][] hotel : 현재 손님이 있는지 확인

    시간복잡도
    O(H*W*N*T) = ? 범위가 주어지지않음

    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            boolean[][] hotel = new boolean[H+1][W+1];
            // 여기까지 입력

            for(int j = 0; j < N; j++) { // 손님을 받는다.
                boolean status = false;
                for(int distance = 1; distance <= W; distance++) { // 거리가 가까워야하므로 거리를 후순위 계산
                    if(status) break;
                    for(int level = 1; level <= H; level++) {
                        if(hotel[level][distance] == false) {
                            hotel[level][distance] = true;
                            status = true;
                            if(j == N-1) {
                                if(distance<10) System.out.println(level + "0" + distance);
                                else System.out.println(level+""+distance);
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
