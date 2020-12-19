package com.classload.test3;

/**
 * @author wangheng
 * @date 2020-12-14
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println(Son.str);
    }
}

class Mother {
    public static String str = "Mother str";

    static {
        System.out.println("Mother Static Block");
    }
}

class Son extends Mother {
    public static String str = "Son str";

    static {
        System.out.println("Son Static Block");
    }
}