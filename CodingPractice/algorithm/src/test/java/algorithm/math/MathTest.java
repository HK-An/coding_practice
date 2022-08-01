package algorithm.math;

import algorithm.math.number.Prime;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MathTest {
    @Test
    public void primeTest_1() {
        Prime p = new Prime();
        boolean result = p.givenNumberIsPrimeWithWillsonsLaw(11);

        assertThat(result).isTrue();
    }
}
