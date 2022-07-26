package kr.hk.number.thousands.ten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class One5649 {
     int n;
     int m;
     List<Integer> result = new ArrayList<Integer>();
     boolean[] visited;
     StringBuilder sb = new StringBuilder();

    public String main(String[] args){

        n = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);

        visited = new boolean[n+1];

        reiterate(0);

        return sb.deleteCharAt(sb.length()-1).toString();
    }

     void reiterate(int num) {
        if(num == m) {
            String temp = result.stream().map(n->n+" ").collect(Collectors.joining()).toString();
            sb.append(temp.substring(0, temp.length() -1) + "\n");
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                result.add(i);
                reiterate(num+1);
                visited[i] = false;
                result.remove(result.size()-1);
            }
        }
    }
}
