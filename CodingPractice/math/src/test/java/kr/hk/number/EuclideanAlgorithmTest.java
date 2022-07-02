package kr.hk.number;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EuclideanAlgorithmTest {

    EuclideanAlgorithm algorithm = new EuclideanAlgorithm();

    @Test
    public void gcdCase1() {
        int expected = 4;
        int answer = algorithm.getGcd(1444, 72);

        assertThat(answer).isEqualTo(expected);
    }

    @Test
    public void lcmCase1() {
        int expected = 25992;
        int answer = algorithm.getLcm(1444, 72);

        assertThat(answer).isEqualTo(expected);
    }
}
