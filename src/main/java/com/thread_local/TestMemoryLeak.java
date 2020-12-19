package com.thread_local;

import lombok.Data;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author wangheng
 * @date 2020-11-28
 */
public class TestMemoryLeak {
    /**
     * 创建了一个核心线程数和最大线程数为5的线程池，这个保证了线程池里面随时都有5个线程在运行
     */
    private static final ThreadPoolExecutor POOL_EXECUTOR = new ThreadPoolExecutor(5, 5,
            1, TimeUnit.MINUTES, new LinkedBlockingQueue<>());

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            POOL_EXECUTOR.execute(() -> {
                User user = new User();
                user.setThreadLocal(new ThreadLocal<>());
                user.getThreadLocal().set(new Memory());
            });
            TimeUnit.SECONDS.sleep(2);
        }
    }
}

@Data
class User {
    private ThreadLocal<Memory> threadLocal;
}

class Memory {
    /**
     * 5MB的内存
     */
    private byte[] memory = new byte[1024 * 1024 * 5];
}


