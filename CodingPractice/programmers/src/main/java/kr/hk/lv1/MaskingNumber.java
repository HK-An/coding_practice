package kr.hk.lv1;

public class MaskingNumber {
    public String solution(String phone_number) {
        if(phone_number.length() == 4) return phone_number;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < phone_number.length(); i++) {
            if(i < phone_number.length() - 4) sb.append("*");
            else sb.append(phone_number.toCharArray()[i]);
        }
        return sb.toString();
    }
}
