package algorithm.implement.mst;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {
    class Node implements Comparable<Node> { // Node 클래스 구현 Comparable은 compareTo로 비교가능하게 한다.(PQ에 넣기 위함)
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

    private int numberOfVertexes;
    private PriorityQueue<Node> pq = new PriorityQueue<>();
    private ArrayList<Node>[] nodeListArr;
    private int totalWeight = 0;
    private boolean[] visited;

    /**
     * 전부 순회하는 그래프 연결에서 가중치의 합을 리턴한다.
     * @param graph 연결구성도{{int from, int to, int weight}, ...}
     * @param numberOfVertexes vertex 의 수
     */
    public int getTotalWeight(int[][] graph, int numberOfVertexes) {
        this.numberOfVertexes = numberOfVertexes;
        visited = new boolean[numberOfVertexes+1]; // 편의성을 위하여 1을 버리기 위해 1개 더 만듦
        nodeListArr = new ArrayList[numberOfVertexes+1]; // 마찬가지

        for(int i = 0; i < numberOfVertexes + 1; i++) {
            nodeListArr[i] = new ArrayList<>();
        }
        
        for(int[] edge : graph) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            
            nodeListArr[from].add(new Node(to, weight)); // arr[출발하는 vertex 번호]에 목적지와 가중치를 추가해준다.
            nodeListArr[to].add(new Node(from, weight)); // arr[도착하는 vertex 번호]에 출발지와 가중치를 추가해준다.
            /* {{1,2,1}, {2,3,2}, {1,3,3}} 을 예로 들면
            *   nodeListArr
            *   [0] = null
            *   [1] = Node(v:2, w:1), Node(v:3, w:3)
            *   [2] = Node(v:3, w:2), Node(v:1, w:1)
            *   [3] = Node(v:2, w:2), Node(v:1, w:3)
            * */
        }

        prim(1);

        return totalWeight;
    }

    private void prim(int addr) {
        pq.add(new Node(addr, 0)); // 시작점은 가중치가 0이다.
        int count = 0;

        while(pq.isEmpty() == false) {
            Node node = pq.poll(); // PQ에서 하나를 꺼낸다.
            
            if(visited[node.vertex]) continue; // 방문한적이 있다면 다음 순회로 넘어간다.

            visited[node.vertex] = true;
            totalWeight += node.weight;

            for(Node next : nodeListArr[node.vertex]) {  // 다음노드가 있다면 꺼낸다
                if(visited[next.vertex] == false) pq.add(next); // 만약 방문한적이 없으면 PQ에 추가한다.
            }

            if(++count == numberOfVertexes) break; // 현재 vertex 를 순회한 횟수가 총 vertex 의 수와 같으면 break
        }
    }
}
