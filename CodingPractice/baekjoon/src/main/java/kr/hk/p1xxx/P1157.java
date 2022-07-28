package kr.hk.p1xxx;

import java.util.*;
import java.util.stream.Collectors;

public class P1157 {
    /*
    아이디어
    1. 입력받은 문자열을 char array로 바꾸어 순회한다.
    2. 각 항목들을 대문자로 바꾼다.
    3. Hashmap에 해당 키가 없으면 value 1과 함께 삽입하고
    4. 해당 키가 있으면 value의 값을 1증가
    5. hashmap의 value를 가지고 배열을 만든다.
    6. 배열을 정렬하여 가장 큰 수를 구하고, 만약 arr[i-1] == arr[i]이면 ? 그렇지 않으면 arr[i]

    */
    static String str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        char answer = 0;
        int biggest = 0;
        List<Integer> list = new ArrayList<>();

        for(char c : str.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for(Character key : map.keySet()) {
            int value = map.get(key);
            list.add(value);
            if(biggest < value) {
                biggest = value;
                answer = key;
            }
        }

        list = list.stream().sorted().collect(Collectors.toList());

        if(list.size() < 2) System.out.println(answer);
        else if(list.get(list.size()-1).equals(list.get(list.size()-2))) System.out.println("?");
        else System.out.println(answer);
    }
}
