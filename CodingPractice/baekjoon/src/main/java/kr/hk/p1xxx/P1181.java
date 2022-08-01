package kr.hk.p1xxx;

import java.util.Arrays;
import java.util.Scanner;

/*
* https://www.acmicpc.net/problem/1181
* 입력받는 string의 객체를 만들어 Comparable을 상속하여 compareTo를 오버라이딩하여 구현하였다.
* 입력받아 저장한 후 Arrays.sort를 사용
* */
public class P1181 {
    /*
    아이디어
        1. 입력: 단어의수(int N), N*(String word)
        2. 비교를 하기위한 Word 클래스를 만든다.
        3. 클래스를 배열에 저장
        3. compareTo를 override하여 사이즈가 같은 경우 일반적인 비교를, 다른 경우 o1.length()-o2.length()
        4. 배열을 출력할때 이전 단어를 저장하고 같으면 출력하지 않는다.
        
    변수
    number of words: int N
    word: String word
    class for compare: class Word
    array for word class: Word[] wordsArr = new Word[N]
    temp str for prevent duplicate print = String temp
    
    시간복잡도
    store words => O(1)
    sort => worst case O(N^2)
         => O(2e4 ^ 2) = O(2e8) < 1s
    */
    static class Word implements Comparable<Word> {
        String str;

        Word(String str) {
            this.str = str;
        }

        @Override
        public int compareTo(Word s) {
            if(this.str.length() == s.str.length()) return this.str.compareTo(s.str);
            else return str.length() - s.str.length();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Word[] wordsArr = new Word[N];

        for(int i = 0; i < N; i++) {
            wordsArr[i] = new Word(sc.nextLine());
        }

        Arrays.sort(wordsArr);
        String tempStr = "0";

        for(Word word : wordsArr) {
            if(tempStr.equals(word.str)) continue;

            System.out.println(word.str);
            tempStr = word.str;
        }
    }
}
