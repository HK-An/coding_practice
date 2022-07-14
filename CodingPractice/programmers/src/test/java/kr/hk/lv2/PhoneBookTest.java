package kr.hk.lv2;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PhoneBookTest {
    PhoneBook pb = new PhoneBook();

    @Test
    public void case1() {
        String[] phone_book = {"119", "97674223", "1195524421"};

        assertThat(pb.solution(phone_book)).isFalse();
    }

    @Test
    public void case2() {
        String[] phone_book = {"123","456","789"};

        assertThat(pb.solution(phone_book)).isTrue();
    }

    @Test
    public void case3() {
        String[] phone_book = {"12","123","1235","567","88"};

        assertThat(pb.solution(phone_book)).isFalse();
    }

    @Test
    public void case4() {
        String[] phone_book = {"12","23","13235","888","88"};

        assertThat(pb.solution(phone_book)).isFalse();
    }
}
