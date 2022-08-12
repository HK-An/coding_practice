package algorithm;

/*
* https://leetcode.com/problems/longest-common-prefix/
* #String
* 3ms(64.33%) 42MB(34.8%)
* */
public class P014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        /*
        1. 반복문으로 푸는데
        2. 각 스트링의 0번지를 모두 비교해보고
        3. 다음에는 1번지를 비교해본다.
        4. 필요한건 각 string의 n번지값
        5. 주어진 배열을 순회하며 모두 같으면 해당 문자열 더하고
        6. 같지 않은게 나오면 리턴
        */
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < strs[0].toCharArray().length; j++) {
            char c1 = strs[0].charAt(j);
            boolean status = true;

            for(int i = 1; i < strs.length; i++) {
                if(strs[i].length() < j+1) {
                    status = false;
                    break;
                }
                char c2 = strs[i].charAt(j);

                if(c1 != c2) {
                    status = false;
                    break;
                }
            }
            if(status) sb.append(c1);
            else break;
        }
        return sb.toString();
    }
}
