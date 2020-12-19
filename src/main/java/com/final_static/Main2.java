package com.final_static;

/**
 * @author wangheng
 * @date 2020-12-17
 **/
public class Main2 {

    public int foo() {
        final int i1 = 2;
        final int i2 = 3;
        return i1 + i2;
    }

    public int foo2() {
        int i1 = 2;
        int i2 = 3;
        return i1 + i2;
    }
}
