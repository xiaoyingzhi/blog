package com.classload.test7;

import java.util.UUID;

/**
 * @author wangheng
 * @date 2020-12-14
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println(Mother.uuid);
    }
}

class Mother {
    public static final String uuid = UUID.randomUUID().toString();

    static {
        System.out.println("Mother Static Block");
    }
}
