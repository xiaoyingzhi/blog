package com.string;

/**
 * @author wangheng
 * @date 2020-11-26
 */
public class TestString01 {

    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = new String("aa");

        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}