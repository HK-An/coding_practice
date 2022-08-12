package algorithm;

/*
* https://leetcode.com/problems/two-sum/
* #Array #HashTable
* 정수의 배열 nums와 정수인 target이 주어졌을때, 배열 내의 두 수를 더해서 target이 되는 요소를 배열에 답아서 리턴하기.
* 각각의 입력당 1개의 답만 있고, 배열 내에 같은 숫자를 두번 사용할 수는 없음.
* 53ms(58.45%), 44.7MB(25.89%)
* */
public class P001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int num1 = i;
            int num2 = 0;
            int sum = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                if(sum + nums[j] == target) {
                    num2 = j;
                    sum += nums[j];
                    break;
                }
            }
            if(sum == target && num2 != 0) {
                answer[0] = num1;
                answer[1] = num2;
                break;
            }
        }

        return answer;
    }
}
