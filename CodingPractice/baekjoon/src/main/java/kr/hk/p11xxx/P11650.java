package kr.hk.p11xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/11650
* #정렬
* */
public class P11650 {
    /*
    아이디어
    1. 입력: number of point(int N) | N * (int x, int y)

    변수
    int N (1<=N<=100000)
    -100,000 ≤ xi, yi ≤ 100,000
    int x
    int y

    시간복잡도
    Arrays.sort() => O(N^2) = O(1e5^2) = O(1e10)
    */

    static class Point implements Comparable<Point> {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            if(p.x != x) return x-p.x;
            return y-p.y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Point[] pointArr = new Point[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pointArr[i] = new Point(x,y);
        }

        Arrays.sort(pointArr);

        for(Point p : pointArr) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
