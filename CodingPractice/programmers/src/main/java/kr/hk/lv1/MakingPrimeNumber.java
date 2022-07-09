package kr.hk.lv1;

public class MakingPrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i + 2 > nums.length) continue;
            int firstNumber = nums[i];
            for(int p = i + 1; p < nums.length; p++) {
                int secondNumber = nums[p];
                for(int j = p + 1; j < nums.length; j++) {
                    int thirdNumber = nums[j];
                    int sum = firstNumber + secondNumber + thirdNumber;

                    if(isPrime(sum)) answer++;
                }
            }
        }

        return answer;
    }

    boolean isPrime(int num) {
        if(num == 1) return false;
        else if(num == 2) return true;
        else if(num % 2 == 0) return false;

        int count = 0;
        for(int i = 3; i <= Math.sqrt(num); i+=2) {
            if(num % i == 0) count++;
        }

        return count == 0;
    }
}
