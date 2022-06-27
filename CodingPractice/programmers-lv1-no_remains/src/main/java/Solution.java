import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answerList = new ArrayList<>();

        for(int num : arr) {
            if(num % divisor == 0) answerList.add(num);
        }
        if(answerList.size() == 0) answerList.add(-1);
        
        return answerList.stream().sorted().mapToInt(n->n).toArray();
    }
}
