package com.classload.test8;

/**
 * @author wangheng
 * @date 2020-12-14
 **/
public class Main {

    static {
        System.out.println("Main Static Block");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.classload.test8.Mother");
    }
}

class Mother {

}

