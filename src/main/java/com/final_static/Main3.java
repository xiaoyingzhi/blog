package com.final_static;

import java.util.concurrent.TimeUnit;

/**
 * @author wangheng
 * @date 2020-12-17
 **/
public class Main3 {

    public static String STR = "STR" + System.currentTimeMillis();

    public static void main(String[] args) throws InterruptedException {

        foo();

        new Thread(() -> {
            while (true) {
                Main3.STR = "STR" + System.currentTimeMillis();
            }
        }).start();


        Thread.currentThread().join();
    }

    public static void foo() throws InterruptedException {

        while (true) {
            System.out.println(Main3.STR);
        }


        //TimeUnit.SECONDS.sleep(1);

        //System.out.println(Main3.STR);
    }

    public static String getStr() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return System.currentTimeMillis() + "";
    }
}
