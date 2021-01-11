package com.string;

/**
 * @author wangheng
 * @date 2020-aa-26
 */
public class TestString {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();
//        test7();
        test8();

//        test8_1();

//        test9();

//       while (true);
    }

    public static void test() {
        String s = "aa";
    }

    public static void test1() {
        String s1 = "aa";
        String s2 = "aa";

        // 加了这句会发生什么
        s1.intern();

        System.out.println(s1 == s2);
    }

    public static void test2() {
        String s1 = new String("");
        String s2 = new String("aa");

        System.out.println(s1 == s2);
    }

    public static void test3() {
        String s1 = new String("aa");
        String s2 = "aa";

        System.out.println(s1 == s2);
    }

    public static void test4() {
        String s1 = "aa";
        String s2 = "a" + "a";

        System.out.println(s1 == s2);
    }

    public static void test5() {
        String s1 = "a";
        String s2 = "a";
        String s3 = s1 + s2;
        String s4 = "aa";

        System.out.println(s3 == s4);
    }

    public static void test6() {
        final String s1 = "a";
        final String s2 = "a";
        String s3 = s1 + s2;
        String s4 = "aa";

        System.out.println(s3 == s4);
    }

    public static void test7() {
        String s1 = new String("a");
        String s2 = new String("a");
        String s3 = s1 + s2;

        // 加了这句会发生什么
        s3.intern();

        String s4 = "aa";

        System.out.println(s3 == s4);
    }

    public static void test8() {
        String s1 = new StringBuilder("aa").toString();

        s1.intern();

        String s2 = "aa";

        System.out.println(s1 == s2);
    }

    public static void test8_1() {
        String s1 = new StringBuilder("a").append("a").toString();

        s1.intern();

        String s2 = "aa";

        System.out.println(s1 == s2);
    }

    public static void test9() {
        String s = new String("aa");

        s.intern();

        System.out.println(s);
    }

}
