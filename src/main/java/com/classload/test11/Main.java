package com.classload.test11;

/**
 * @author wangheng
 * @date 2020-12-14
 **/
public class Main {

    public static void main(String[] args) {
        Mother obj = Mother.getInstance();

        System.out.println(Mother.val1);
        System.out.println(Mother.val2);
    }
}

class Mother {

    public static int val1;
    public static int val2 = 1;

    public static Mother instance = new Mother();

    Mother() {
        val1++;
        val2++;
    }


    public static Mother getInstance() {
        return instance;
    }
}
