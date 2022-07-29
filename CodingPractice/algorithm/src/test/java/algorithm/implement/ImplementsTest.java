package algorithm.implement;

import algorithm.implement.mst.Prim;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ImplementsTest {


    @Test
    public void test_greedy_coin_1() {
        Greedy a = new Greedy();
        int price = 4040;
        int paid = 5000;
        int[] expected = {1,4,1,1};

        int[] answer = a.changes(price, paid);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_greedy_coin_2() {
        Greedy a = new Greedy();
        int price = 97680;
        int paid = 100000;
        int[] expected = {4,3,0,2};

        int[] answer = a.changes(price, paid);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_greedy_coin_3() {
        Greedy a = new Greedy();

        int price = 0;
        int paid = 100;
        int[] expected = {0,1,0,0};

        int[] answer = a.changes(price, paid);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_greedy_coin_4() {
        Greedy a = new Greedy();

        int price = 480;
        int paid = 0;
        int[] expected = {0,0,0,0};

        int[] answer = a.changes(price, paid);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_greedy_timetable_1() {
        Greedy a = new Greedy();

        int[][] classes = {{4,7},{1,8},{2,5},{5,9},{8,10},{9,11},{1,3},{11,14},{13,16}};
        int expected = 4;

        int answer = a.timetable(classes);

        assertThat(answer).isEqualTo(expected);
    }


    @Test
    public void test_prim_1() {
        Prim p = new Prim();

        int[][] graph = {{1, 2, 1}, {2, 3, 2}, {1, 3, 3}};
        int vertexes = 3;
        int expected = 3;

        int answer = p.getTotalWeight(graph, vertexes);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void test_prim_2() {
        Prim p = new Prim();

        int[][] graph = {{1,2,29},{1,6,10},{2,3,16},{2,7,15},{3,4,12},{4,5,22},{4,7,18}, {5, 7, 25},{5,6,27}};
        int vertexes = 7;
        int expected = 102;

        int answer = p.getTotalWeight(graph, vertexes);

        assertThat(answer).isEqualTo(expected);
    }
}
