package com.final_static;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author wangheng
 * @date 2020-12-17
 **/
public class Main4 {

    public static void main(String[] args) {

        A[] arr = new A[5];

        //大端小端存储
//        System.out.println(Arrays.hashCode(arr));
//
//        //大端小端存储
//        System.out.println(Integer.toHexString(arr.hashCode()));

        System.out.println(ClassLayout.parseInstance(arr).toPrintable());

//        synchronized (arr) {
//            System.out.println("加锁");
//        }
    }
}

class A {

}
