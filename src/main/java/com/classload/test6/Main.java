package com.classload.test6;

/**
 * @author wangheng
 * @date 2020-12-14
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println(Mother.str);
    }
}

class Mother {

    public static final String str = "Mother Str";

    static {
        System.out.println("Mother Static Block");
    }


//    public static final String str = "A Str";
}
