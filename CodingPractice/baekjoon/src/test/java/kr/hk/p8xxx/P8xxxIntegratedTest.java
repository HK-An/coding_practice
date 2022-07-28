package kr.hk.p8xxx;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class P8xxxIntegratedTest {

    @Test
    public void test_8958() {
        P8958 s = new P8958();
        String[] args = {"5", "OOXXOXXOOO", "OOXXOOXXOO", "OXOXOXOXOXOXOX", "OOOOOOOOOO", "OOOOXOOOOXOOOOX"};

        String expected = "10\n" +
                "9\n" +
                "7\n" +
                "55\n" +
                "30";

        String answer = s.solution(args);

        assertThat(answer).isEqualTo(expected);

    }

    @Test
    public void test_8958_1() {
        P8958 s = new P8958();
        String[] args = {"1", "OXOXOXOXO"};

        String expected = "5";

        String answer = s.solution(args);

        assertThat(answer).isEqualTo(expected);

    }
    long[] arr1;
    @Test
    public void test() {
        int N = 5;
        String[] str1 = "4 1 5 2 3".split(" ");
        arr1 = new long[N];// 여기까지 N과 arr1 저장
        for (int i = 0; i < N; i++) {
            arr1[i] = Long.parseLong(str1[i]);
        } // 여기까지 N과 arr1 저장

        int M = 5;
        String[] str2 = "1 3 7 9 5".split(" ");
        long[] arr2 = new long[M]; // 여기까지 M과 arr2 저장
        for (int i = 0; i < M; i++) {
            arr2[i] = Long.parseLong(str2[i]);
        }

        Arrays.sort(arr1); // 여기까지 정렬

        StringBuilder sb = new StringBuilder();
        int printResult = 0;
        for (long target : arr2) { // arr2의 요소를 가져와 탐색
//            int result = binarySearch(0, arr1.length, target);
            int result = Arrays.binarySearch(arr1, target);
            printResult = result < 0 ? 0 : 1;
            sb.append(printResult + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
//        String result = sb.toString().equals("1") ? "success" : "fail";
//        System.out.println(sb.toString());
//        System.out.println(result);
        assertThat(sb.toString()).isEqualTo("1\n" +
                "1\n" +
                "0\n" +
                "0\n" +
                "1");
    }
    int binarySearch(int start, int end, long target){
        if(start == end) return 0;
        int result;

        int mid = (start + end) /2;
        if(arr1[mid] == target) result = 1;
        else if(arr1[mid] < target) result = binarySearch(mid+1, end, target);
        else result = binarySearch(start, mid, target);

        return result;
    }
}
