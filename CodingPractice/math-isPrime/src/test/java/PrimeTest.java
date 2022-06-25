import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PrimeTest {

    Prime p = new Prime();

    @Test
    public void testIsPrime() {
        int prime = 173;
        int notPrime = 946;

        assertThat(p.isPrime(prime)).isTrue();
        assertThat(p.isPrime(notPrime)).isFalse();
    }
}
