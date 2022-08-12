package algorithm;

/*
* https://leetcode.com/problems/palindrome-number/
* #math
* 정수 x가 주어질때, x가 palindrome 수라면 true 를 반환하시오.
* 주어진 정수 x가 거꾸로 읽어도 올바르게 읽은 것과 같을떄 x를 palindrome 수 라고 한다.
* 30ms(88.93%), 48.3MB(92.11%)
* */
public class P009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        /*
        팔린드롬은
        1. 홀수일때
            1.1. 홀수일때는 121, 12321 처럼 가운데 숫자를 빼고 나머지가 뒤집었을때 같아야함
            1.2. 가운데는 길이/2+1
            1.3. 가운데를 기준으로 앞뒤를 자름 (str1: 0, mid | str2: mid, length)
        2. 짝수일때
            2.1. 짝수일때는 1221. 123321 처럼 절반이 뒤집엇을떄 같아야함
            2.2. 가운데는 길이/2
            2.3. str1: 0, mid+1 | str2: mid, length

        3. 뒤집어서 같은지 확인
        */
        String strX = String.valueOf(x);
        if(strX.length() == 0) return false;
        else if(strX.length() == 1) return true;
        boolean isEven = strX.length() % 2 == 0 ? true : false;
        int middle = isEven ? strX.length()/2 : strX.length()/2 +1;
        String front = isEven ? strX.substring(0, middle) : strX.substring(0, middle-1);
        String back =strX.substring(middle);

        StringBuilder reversed = new StringBuilder();
        for(int i = front.length()-1; i >= 0; i--) {
            reversed.append(front.toCharArray()[i]);
        }

        if(reversed.toString().equals(back)) return true;
        else return false;
    }
}
