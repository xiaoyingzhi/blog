package com.thread_local;

import java.lang.ref.WeakReference;

/**
 * @author wangheng
 * @date 2020-11-28
 */
public class TestWeakReference {

    public static void main(String[] args) {
        WeakReference<Object> wf = new WeakReference<>(new Object());
        System.out.println("垃圾回收前：" + wf.get());

        //垃圾回收
        System.gc();
        System.out.println("垃圾回收后：" +wf.get());
    }
}
