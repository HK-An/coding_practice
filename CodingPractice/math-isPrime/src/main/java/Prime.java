import java.util.Arrays;

public class Prime {

    public boolean isPrime(int number) {
        boolean result = true;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) result = false;
        }

        return result;
    }

    public int getCountOfPrimeUnderNumber(int number) {
        int answer = 0;
        boolean[] sieve = getSieveOfEratosthenes(number);

        for(boolean flag : sieve) {
            if(flag) answer += 1;
        }

        return answer;
    }

    public boolean[] getSieveOfEratosthenes(int number) {
        boolean[] sieve = new boolean[number+1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for(int i = 2; i < Math.sqrt(number) + 1; i++) {
            if(sieve[i] == true) {
                for( int j = i * 2; j <= number; j += i) {
                    sieve[j] = false;
                }
            }
        }

        return sieve;
    }
}
