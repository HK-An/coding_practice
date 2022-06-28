package algorithm;

import algorithm.implement.Greedy;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GreedyTest {

    Greedy a = new Greedy();

    @Test
    public void testChangesCase1() {
        int price = 4040;
        int paid = 5000;
        int[] expected = {1,4,1,1};

        int[] answer = a.changes(price, paid);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void testChangesCase2() {
        int price = 97680;
        int paid = 100000;
        int[] expected = {4,3,0,2};

        int[] answer = a.changes(price, paid);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void testChangesCase3() {
        int price = 0;
        int paid = 100;
        int[] expected = {0,1,0,0};

        int[] answer = a.changes(price, paid);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void testChangesCase4() {
        int price = 480;
        int paid = 0;
        int[] expected = {0,0,0,0};

        int[] answer = a.changes(price, paid);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void testTimetableCase1() {
        int[][] classes = {{4,7},{1,8},{2,5},{5,9},{8,10},{9,11},{1,3},{11,14},{13,16}};
        int expected = 4;

        int answer = a.timetable(classes);

        assertThat(answer).isEqualTo(expected);
    }
}
