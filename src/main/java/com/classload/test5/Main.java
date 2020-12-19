package com.classload.test5;

/**
 * @author wangheng
 * @date 2020-12-14
 **/
public class Main {

    public static void main(String[] args) {
        Mother obj = new Mother();
    }
}

class Mother {
    static {
        System.out.println("Mother Static Block");
    }
}
