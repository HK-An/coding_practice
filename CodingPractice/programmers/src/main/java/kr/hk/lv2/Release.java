package kr.hk.lv2;

import java.util.*;

public class Release {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue remainingDays = makeQueue(progresses, speeds);
        List<Integer> answerList = new ArrayList<>();
        double days = 0;

        while(true) {
            if(remainingDays.size() == 0) break;
            int releases = 0;
            int size = remainingDays.size();
            days += 1;

            for(int i = 0; i <= size; i++) {
                if(remainingDays.size() == 0) break;
                if((double)remainingDays.peek() <= days) {
                    releases += 1;
                    remainingDays.poll();
                } else
                    break;
            }
            if(releases > 0) answerList.add(releases);

        }

        return answerList.stream().mapToInt(a->a).toArray();
    }

    Queue makeQueue(int[] progresses, int[] speeds) {
        Queue queue = new LinkedList();
        for(int i = 0; i < progresses.length; i++) {
            int remains = 100 - progresses[i];

            queue.offer(Math.ceil((double)remains / speeds[i]));
        }

        return queue;
    }
}
