public class Solution {
    public String solution(int n) {
        StringBuilder stb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) stb.append("박");
            else stb.append("수");
        }
        return stb.toString();
    }
}
