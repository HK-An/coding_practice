package kr.hk.lv1;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PressingKeypadTest {

    PressingKeypad pressingKeypad = new PressingKeypad();
    @Test
    public void testCalculateDistance() throws Exception {
        Hand rightHand3 = new Hand(3, "right");
        Hand rightHand5 = new Hand(6, "right");
        Hand rightHand7 = new Hand(9, "right");
        Hand rightHandOrigin = new Hand(12, "right");

        Hand leftHandOrigin = new Hand(10, "left");

        int answer1 = pressingKeypad.calculateDistance(rightHand3, 2);
        int answer2 = pressingKeypad.calculateDistance(rightHand5, 2);
        int answer3 = pressingKeypad.calculateDistance(rightHand7, 2);
        int answer4 = pressingKeypad.calculateDistance(rightHandOrigin, 0);

        int answerLeft1 = pressingKeypad.calculateDistance(leftHandOrigin, 0);


        assertThat(answer1).isEqualTo(1);
        assertThat(answer2).isEqualTo(2);
        assertThat(answer3).isEqualTo(3);
        assertThat(answer4).isEqualTo(1);

        assertThat(answerLeft1).isEqualTo(1);
    }

    @Test
    public void case1() throws Exception {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String expected = "LRLLLRLLRRL";

        String answer = pressingKeypad.solution(numbers, hand);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case2() throws Exception {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        String expected = "LRLLRRLLLRR";

        String answer = pressingKeypad.solution(numbers, hand);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void case3() throws Exception {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        String expected = "LLRLLRLLRL";

        String answer = pressingKeypad.solution(numbers, hand);

        assertThat(answer).isEqualTo(expected);
    }
}
