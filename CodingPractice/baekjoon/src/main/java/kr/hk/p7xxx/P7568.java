package kr.hk.p7xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
* https://www.acmicpc.net/problem/7568
* #구현 #브루트포스
* */
public class P7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        List<Person> people = new ArrayList<>();

        for(int i =0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            Person p = new Person(i, height, weight);
            people.add(p);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                Person personA = people.get(i);
                Person personB = people.get(j);

                if(personA.height < personB.height && personA.weight < personB.weight) rank++;
            }
            if(i == N-1) sb.append(rank);
            else sb.append(rank + " ");
        }
        System.out.println(sb);
    }

    static class Person {
        int idx;
        int height;
        int weight;

        Person(int idx, int height, int weight) {
            this.idx = idx;
            this.height = height;
            this.weight = weight;
        }
    }
}
