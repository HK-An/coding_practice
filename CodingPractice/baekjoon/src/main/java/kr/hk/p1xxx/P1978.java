package kr.hk.p1xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/1978
* #수학 #정수론 #소수판정 #에라토스테네스의체
*
* 에라토스테네스의체로 풀었다. 이름이 너무 어렵다.
* 아직 에라체에 대한 이해가 부족한것같아 다시 정리하자면
* 1. 1은 소수가 아니다.
* 2. 2를 제외한 2의 배수는 소수가 아니다.
* 3. 3을 제외한 3의 배수는 소수가 아니다.
* 4. 5를 제외한 5의 배수는 소수가 아니다.
* 5, 7을 제외한 7의 배수는 소수가 아니다.
* 6. 이런식으로 알아보고자하는 최대 수(N)에 대하여 sqrt(N,2)까지 반복한다.
*
* 그런데 에라체는 범위에서 소수가 얼마나 있는지에 대해서는 유용하지만, "특정 수가 소수인가?"에 대해서는 "소수판정법"이라는 방법이 더 좋다고 한다.
* > 윌슨의 정리(간단한 정리): ((P-1)! + 1) MOD P = 0      => 수가 커지면 계산하는데 오래걸린다.
* AKS라는 비교적 최근 발견된 강력한 소수판정법이 있지만 무슨뜻인지 잘 모르겠음
* */
public class P1978 {
    /*
    아이디어
    1. 입력: numbers of given numbers(int N) | N*(number (int num))
    2. 출력: numbers of prime number from given numbers
    4. 배열에서 하나씩 꺼내 그 무슨 에라뭐시기 체를 이용하여 소수인지 확인한다.
    5. 소수이면 count를 1증가시키낟.
    6. count를 출력

    변수
    int N(N <= 100)
    int num(num <= 1000)
    int count (count <= 100)
    boolean[] sieve = new boolean[N]

    시간복잡도
    insert-> O(1)
    get-> O(1)

    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        boolean[] sieve = getSieve();
        st = new StringTokenizer(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++) {
            if(sieve[Integer.parseInt(st.nextToken())] == true) count++;
        }

        System.out.println(count);
    }

    static boolean[] getSieve() {
        int maxSize = 1000;
        boolean[] sieve = new boolean[maxSize+1];
        Arrays.fill(sieve, true);

        sieve[0] = false;
        sieve[1] = false;

        for(int i = 0; i < Math.sqrt(maxSize) + 1; i++) {
            if(sieve[i] == true) {
                for(int j = i  * 2; j <= maxSize; j+=i) {
                    sieve[j] = false;
                }
            }
        }

        return sieve;
    }
}
