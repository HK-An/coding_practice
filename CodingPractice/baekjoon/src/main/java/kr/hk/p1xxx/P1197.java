package kr.hk.p1xxx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1197 {
    static int result;
    static ArrayList<Node>[] arr;
    static PriorityQueue<Node> q = new PriorityQueue<>();
    static boolean[] visited;
    static int V;

    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        visited = new boolean[V+1];
        arr = new ArrayList[V+1];

        for(int i = 0; i < V+1; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            arr[A].add(new Node(B, C));
            arr[B].add(new Node(A, C));
        } // 여기까지 입력
        prim(1);
        System.out.println(result);
    }

    static void prim(int addr) {
        // 연결된 간선의 가중치중에 가장 적은 값을 찾아야한다.
        q.add(new Node(addr, 0));
        int count = 0;
        while(q.isEmpty() == false) {
            Node node = q.poll();

            if(visited[node.vertex]) continue;
            visited[node.vertex] = true;

            result += node.weight;

            for(Node next : arr[node.vertex]) {
                if(visited[next.vertex] == false) {
                    q.add(next);
                }
            }
            if(++count == V) break;
        }
    }
}
