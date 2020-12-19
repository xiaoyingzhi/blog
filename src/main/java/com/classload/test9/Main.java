package com.classload.test9;

/**
 * @author wangheng
 * @date 2020-12-14
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println(new Son().str);
    }
}

class Mother {

    static {
        System.out.println("Mother Static Block");
    }
}

class Son extends Mother {
    public String str = "Son str";

    static {
        System.out.println("Son Static Block");
    }
}
