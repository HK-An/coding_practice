package kr.hk.p10xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/10814
* #정렬
*
* 시도
* 1. 접근하는 방법은 맞았으나 문제를 제대로 보지않아 나이순, 이름순으로 멋대로 생각함. -> 틀림
* 2. 입력은 가입순이라는걸 확인하고 성공
*
* 새로배운것
* 1. comparable에서 string끼리 비교할때는 str.compareTo(anotherStr)
* */
public class P10814 {
    static class Member implements Comparable<Member> {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member m) {
            if(age != m.age) return age-m.age;
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Member[] members = new Member[N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name);
        }
        Arrays.sort(members);

        for(Member m : members) {
            System.out.println(m.age + " " + m.name);
        }
    }
}
