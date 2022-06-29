package kr.hk;

public class Solution {

    public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase(); // 1단계
        answer = removeRestrictLetter(answer); // 2단계
        answer = onlySingleCascadeDot(answer); // 3단계
        answer = removeDotFirstAndLast(answer); // 4단계
        answer = answer.length() < 1 ? "a" : answer; // 5단계
        answer = regulateIdLength(answer); // 6단계
        answer = addLastCharIfShort(answer); // 7단계

        return answer;
    }

    private String addLastCharIfShort(String str) {
        char lastChar = str.charAt(str.length() - 1);
        StringBuilder sb = new StringBuilder(str);

        while(true) {
            if(sb.length() < 3) {
                sb.append(lastChar);
            } else break;

        }
        return sb.toString();
    }

    private String regulateIdLength(String str) {
        if(str.length() > 15) str = str.substring(0, 15);
        str = removeDotFirstAndLast(str);

        return str;
    }

    private String removeDotFirstAndLast(String str) {
        if(str.charAt(0) == '.') str = str.substring(1, str.length());
        if(str.length() != 0 && str.charAt(str.length() - 1) == '.') str = str.substring(0, str.length() -1);

        return str;
    }

    private String onlySingleCascadeDot(String str) {

        while(str.contains("..")) {
            str = str.replaceAll("\\.\\.", ".");
        }

        return str;
    }

    private String removeRestrictLetter(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') == true || (c >= '0' && c <= '9') || c == '-' || c == '.' || c == '_') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
