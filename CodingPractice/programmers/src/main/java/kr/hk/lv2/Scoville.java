package kr.hk.lv2;

import java.util.PriorityQueue;

public class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int zeroCnt = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int food : scoville) {
            if(food == 0) zeroCnt++;
            queue.add(food);
        }
        if(zeroCnt >= 2) return -1;

        while(!allItemsOverNumber(queue, K)) {
            if(answer > scoville.length -1) {
                answer = -1;
                break;
            }
            answer++;
            mixFood(queue);
        }

        return answer;
    }

    boolean allItemsOverNumber(PriorityQueue<Integer> heap, int number) {
        boolean answer = true;

        for(int data : heap) {
            if(data < number) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    void mixFood(PriorityQueue<Integer> heap) {
        if(heap.size() < 2) return;
        int newFood = heap.poll() + heap.poll() * 2;
        heap.add(newFood);
    }
}