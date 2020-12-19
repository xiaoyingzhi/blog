package com.classload.Test4;

/**
 * @author wangheng
 * @date 2020-12-14
 **/
public class Main {

    public static void main(String[] args) {

        Mother arrs[] = new Mother[1];
    }
}

class Mother {
    static {
        System.out.println("Test_4_A Static Block");
    }
}
