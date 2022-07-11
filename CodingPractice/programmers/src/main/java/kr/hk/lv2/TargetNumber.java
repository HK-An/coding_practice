package kr.hk.lv2;

public class TargetNumber {
    int[] numbersArr;
    int target;
    int count = 0;
    public int solution(int[] numbers, int target) {
        this.target = target;
        numbersArr = numbers;

        search(0, -1);
        return count;
    }

    void search(int sum, int idx) {
        int thisIdx = idx  + 1;
        if(thisIdx == numbersArr.length) return;

        int value = numbersArr[thisIdx];
        int sumWithPositive = sum + value;
        int sumWithNegative = sum - value;

        if(sumWithPositive == target && thisIdx + 1 == numbersArr.length) {
            count++;
            return;
        } else search(sumWithPositive, thisIdx);

        if(sumWithNegative == target && thisIdx + 1 == numbersArr.length) {
            count++;
            return;
        } else search(sumWithNegative, thisIdx);
    }
}
