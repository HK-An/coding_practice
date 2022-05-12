package kr.hk;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StringCompressTest {
    private StringCompress sc = new StringCompress();

    String s0 = "aaa";
    String s1 = "aabbaccc";
    String s2 = "ababcdcdababcdcd";
    String s3 = "abcabcdede";
    String s4 = "abcabcabcabcdededededede";
    String s5 = "xababcdcdababcdcd";
    String s6 = "werwerwsdgsdfsdfsdf";
    String s7 = "xztjabcdabcd";
    String s8 = "xxxxxxxxxxyyy";
    String s9 = "aaaaaaaaaa";
    String s10 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    String s11 = "a";

    @Test
    public void stringCompress0() throws Exception{
        assertThat(sc.solution(s0), is(2)); // expected result -> 3a (2byte)
    }
    @Test
    public void stringCompress1() throws Exception{
        assertThat(sc.solution(s1), is(7)); // expected result -> 2a2ba3c (7byte)
    }
    @Test
    public void stringCompress2() throws Exception{
        assertThat(sc.solution(s2), is(9));
    }
    @Test
    public void stringCompress3() throws Exception{
        assertThat(sc.solution(s3), is(8));
    }
    @Test
    public void stringCompress4() throws Exception{
        assertThat(sc.solution(s4), is(14));
    }
    @Test
    public void stringCompress5() throws Exception{
        assertThat(sc.solution(s5), is(17));
    }
    @Test
    public void stringCompress6() throws Exception{
        assertThat(sc.solution(s6), is(15));
    }
    @Test
    public void stringCompress7() throws Exception{
        assertThat(sc.solution(s7), is(9));
    }
    @Test
    public void stringCompress8() throws Exception{
        assertThat(sc.solution(s8), is(5));
    }
    @Test
    public void stringCompress9() throws Exception{
        assertThat(sc.solution(s9), is(3));
    }
    @Test
    public void stringCompress10() throws Exception{
        assertThat(sc.solution(s10), is(5));
    }
    @Test
    public void stringCompress11() throws Exception{
        assertThat(sc.solution(s11), is(1));
    }
    @Test
    public void test_splitStrToList() {
        List<String> case1 = new ArrayList<>();
        case1.add("a");
        case1.add("a");
        case1.add("a");

        List<String> case2 = new ArrayList<>();
        case2.add("aa");
        case2.add("bb");
        case2.add("ac");
        case2.add("cc");

        assertThat(sc.splitStrToListAsSize(s1, 2), is(case2));
    }

    @Test
    public void test_getCompressedStr1() throws Exception {
        List<String> case1 = new ArrayList<>();
        case1.add("a");
        case1.add("a");
        case1.add("a");

        List<String> case2 = new ArrayList<>();
        case2.add("aa");
        case2.add("bb");
        case2.add("ac");
        case2.add("cc");

        assertThat(sc.getCompressedStr(case1), is("3a"));
    }
    @Test
    public void test_getCompressedStr2() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("aa");
        expected.add("bb");
        expected.add("ac");
        expected.add("cc");

        assertThat(sc.getCompressedStr(expected), is("aabbaccc"));
    }
    @Test
    public void test_getCompressedStr3() throws Exception {
        List<String> expected = new ArrayList<>();

        expected.add("ababcdcd");
        expected.add("ababcdcd");

        assertThat(sc.getCompressedStr(expected), is("2ababcdcd"));
    }
}
