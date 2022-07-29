package kr.hk.p2xxx;

import java.util.Scanner;

public class P2292 {
    /*
    아이디어
    1. 1이 있는곳을 1차원 D(1), 1차원을 둘러싼 것을 2차원 D(2), 그 다음을 3차원 D(3)이라고 할때
    2. 각 차원의 최댓값은 D(N)M = D(N-1) + 6 * (N-1)
    3. 2번을 통하여 주어진 값이 몇차원에 있는지 구한다.
    4. 차원을 출력


    자료구조

    시간복잡도

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.nextLine());

        if(N == 1) {
            System.out.println(1);
            return;
        }

        Long prevMax = 1L;
        int dimension = 2;
        while(true) {
            Long max = prevMax + 6 * (dimension -1);
            if(max >= N) break;

            dimension++;
            prevMax = max;
        }

        System.out.println(dimension);
    }
}
