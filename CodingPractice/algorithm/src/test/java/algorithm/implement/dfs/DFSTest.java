package algorithm.implement.dfs;

import org.junit.Test;

public class DFSTest {

    @Test
    public void testDFS() {
        DFS dfs = new DFS(4);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 3);

        System.out.println("From top");
        dfs.search();
        System.out.println("\nFrom 2");
        dfs.search(2);

    }
}
