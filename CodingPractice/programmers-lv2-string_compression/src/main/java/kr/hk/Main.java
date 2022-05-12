package kr.hk;

public class Main {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        StringCompress sc = new StringCompress();
        String rawString = "abcabcabcabcdededededede";

        System.out.println("[Raw String을 압축]");
        System.out.println("===============================================");
        System.out.printf("압축대상 : {%s} \n", rawString);
        int compressedStrSize = sc.solution(rawString);
        System.out.printf("압축된 문자열의 크기 : %d \n", compressedStrSize);
        long afterTime = System.currentTimeMillis();
        System.out.printf("소요시간 : %d ns\n", afterTime-beforeTime);
        System.out.println("===============================================");
    }
}