package com.classload.test12;

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

//    public static int val1;

    public static Mother instance = new Mother();

    Mother() {
        val1++;
        val2++;
         System.out.println("val1 = " + val1 + "\t val2 = " + val2);
    }

    public static int val1 = 2;
    public static int val2 = 0;

    public static Mother getInstance() {
        return instance;
    }
}
