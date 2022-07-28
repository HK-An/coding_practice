package kr.hk.p1xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546 {
    /*
    아이디어
    1. 입력: subjectNumber, score[]
    2. score을 순회하며 최댓값 M을 구한다.
    3. score[i]/M * 100 => manipulated[i]
    4. manipulated.sum()/subjectNumber -> print
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int subjectNumber = Integer.parseInt(st.nextToken());
        int[] score = new int[subjectNumber];
        double[] manipulated = new double[subjectNumber];
        int M = 0;
        double sumOfManipulated = 0;
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < subjectNumber; i++) {
            int thisScore = Integer.parseInt(st.nextToken());
            M = Math.max(M, thisScore);
            score[i] = thisScore;
        }

        for(int i = 0; i < subjectNumber; i++) {
            double fakeScore = (double)score[i] / M * 100;
            manipulated[i] = fakeScore;
        }

        for(double fakeScore : manipulated) {
            sumOfManipulated += fakeScore;
        }
        System.out.println((double)sumOfManipulated / subjectNumber);

    }
}
