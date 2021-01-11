package com.string;



/**
 * @author wangheng
 * @date 2020-12-25
 **/
public class TestDoEscapeAnalysis {
    public static void main(String[] args) {
        Foo foo = new Foo();
        while (true) {
            foo.newString();
        }
    }
}
class Foo {
    public void newString() {
        String s1 = new String("xyz");
        String s2 = new String("xyz");
        String s3 = new String("xyz");
        String s4 = new String("xyz");
    }
}
