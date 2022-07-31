package kr.hk.p11xxx;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 이항 계수 1
* 이항계수란 (a + b)^n 형태의 다항식을 전개했을 때, (a^r)(b^n-r)의 계수를 의미하며, 다음과 같이 정리할수 있다.
* (n r)(n이 위 r이 아래)일때 n!/r!(n-r)!
* https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=freewheel3&logNo=220786117232
*
* #수학 #구현 #조합론
* */
public class P11050 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(fact(N)/(fact(K)* fact(N-K)));

    }

    static long fact(int num) {
        int result = 1;
        for(int i=num; i >= 1; i--) {
            result *= i;
        }

        return result;
    }
}
