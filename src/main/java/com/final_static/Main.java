package com.final_static;

import java.util.UUID;

public class Main {

    public final int a = 1;
    public final String b = "bbb";
    public final Object c = new Object();
    public final int d;
    public final String e = UUID.randomUUID().toString();

    public Main() {
        d = 2;
    }
}

