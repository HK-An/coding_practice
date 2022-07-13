package kr.hk.lv2;

import java.util.HashMap;
import java.util.Map;

class PrimeNumber {
    Map<Integer, Integer> primeMap = new HashMap<>();
    boolean[] visited = new boolean[7];
    String numbers;

    public int solution(String numbers) {
        this.numbers = numbers;
        for(int i=0; i<numbers.length(); i++){
            StringBuilder sb = new StringBuilder();
            dfs(sb,i+1); // 1자리부터 n자리까지의 값을 모두 구한다.
        }

        return primeMap.size();
    }

    void dfs(StringBuilder sb, int size) {
        if(sb.length() == size){ // 현재 숫자의 길이가 n이라면
            int num = Integer.parseInt(sb.toString());
            if(isPrime(num)){ // 소수일 경우
                primeMap.put(num, num); // HashMap에 저장한다. 이때 중복된 값은 hashmap의 특성으로 자동으로 걸러진다.
            }
        }

        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){ // 방문한 적이 없는 노드일 경우
                visited[i] = true; // 방문 처리
                sb.append(numbers.charAt(i)); // 해당 숫자를 문자열에 더한다
                dfs(sb, size); // 하나의 depth를 더 들어가 탐색한다.
                visited[i] = false; // 위의 하나의 depth를 더 들어간 탐색을 마치면 현재 노드의 방문처리를 지운다. 그렇게 해야 다음 순회시에 해당 노드를 포함할 수 있다.
                // e.g. {1,2,3} -> 1, 12(이때 방문한 2의 방문처리를 다시 지워야 다음번에 탐색할 수 있음), 13(마찬가지), 123(이때 2와 3이 방문처리해제가 안되어있으면
                // 그냥 지나치게 된다.), 132(마찬가지)
                sb.deleteCharAt(sb.length() -1); // 32라인에서 추가한 문자는 depth를 하나 들어가기 위한 처리였으므로 마지막을 삭제해준다.
            }
        }

    }

    boolean isPrime(int number) {
        boolean result = true;
        if(number == 0) return false;
        if(number == 1) return false;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) result = false;
        }

        return result;
    }
}