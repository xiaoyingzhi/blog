package com;

import java.util.concurrent.TimeUnit;

/**
 * @author wangheng
 * @date 2021-01-06
 **/
public class ZGC {

    public static void main(String[] args) throws InterruptedException {

        String objectAddress = "10000000000";

        String m0_color = "0001";
        String m1_color = "0010";
        String r_color = "0100";

        //通过Marked0视图的虚拟地址拿到对象
        getA(m0_color + " " + objectAddress);
        //通过Marked1视图的虚拟地址拿到对象
        getA(m1_color + " " + objectAddress);
        //通过Remapped视图的虚拟地址拿到对象
        getA(r_color + " " + objectAddress);
    }


    private static Object getA(String pointer) throws InterruptedException {
        switch (pointer) {
            //M0
            case "0001 10000000000":
                //M1
            case "0010 10000000000":
                //R
            case "0100 10000000000":
                //真正去内存取数据，比较耗费时间
                TimeUnit.SECONDS.sleep(10);
                return new Object();
            default:
                throw new RuntimeException("找不到A对象");
        }
    }
}
