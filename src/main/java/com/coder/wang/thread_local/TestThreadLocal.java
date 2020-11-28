package com.coder.wang.thread_local;

/**
 * @author wangheng
 * @date 2020-11-26
 */
public class TestThreadLocal {

    private static final ThreadLocal<String> CAR_HOUSEKEEPER = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            CAR_HOUSEKEEPER.set("富商A的兰博基尼");
            System.out.println("富商A拿到的兰博基尼:" + CAR_HOUSEKEEPER.get());

            CAR_HOUSEKEEPER.remove();
            System.out.println("富商A把车卖了之后拿到的兰博基尼:" + CAR_HOUSEKEEPER.get());

        }, "富商A").start();

        new Thread(() -> {
            CAR_HOUSEKEEPER.set("富商B的兰博基尼");
            System.out.println("富商B拿到的兰博基尼:" + CAR_HOUSEKEEPER.get());
            CAR_HOUSEKEEPER.remove();
        }, "富商B").start();

        //阻塞主线程
        Thread.currentThread().join();
    }
}