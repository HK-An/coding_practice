package kr.hk.lv2;

import java.util.*;
import java.util.stream.Collectors;

public class Printer {

    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = addItemsToQueue(priorities); // 주어진 배열을 queue로 변경
        // 주어진 배열을 내림차순으로 정렬
        List<Integer> reverseSortedList = Arrays.stream(priorities).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> printList = getPrintList(queue, reverseSortedList); // 프린트 순서를 획득

        int answer = 1;
        for(int num : printList) { // 프린트 순서를 탐색하면서 인덱스를 확인
            if(location == num) break;
            answer++;
        }
        return answer;
    }

    List<Integer> getPrintList(Queue<int[]> queue, List<Integer> list) {
        List<Integer> printList = new ArrayList<>();
        int i = 0;
        while(queue.size() != 0) {
            int[] arr = queue.poll(); // queue에서 획득

            if(arr[1] != list.get(i)) queue.add(arr); // 현재 가장 높은 우선순위가 아니라면 queue에 저장(마지막으로 이동함)
            else {
                printList.add(arr[0]); // 획득한 값이 최우선순위일경우 프린트 리스트에 저장 (데이터는 queue에서 삭제됨)
                i++; // 다음 우선순위를 획득하기 위한 idx 증가
            }
        }
        return printList;
    }

    Queue<int[]> addItemsToQueue(int[] priorities) {
        Queue<int[]> queue = new LinkedList<>();
        int idx = 0;

        for(int priority : priorities) {
            int[] arr = new int[2];
            arr[0] = idx; // 0번지에는 현재 위치를 저장
            arr[1] = priority; // 1번지에는 우선순위를 저장
            queue.add(arr);
            idx++;
        }

        return queue;
    }
}
