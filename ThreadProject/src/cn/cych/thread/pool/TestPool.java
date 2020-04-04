package cn.cych.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
    public static void main(String[] args) {
        // 创建线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // 创建Runnable实例对象
        Runnable runnable = new SwimRunnable();
        // 从线程池获取线程对象，然后调用run()方法
        executorService.submit(runnable);
        // 再次获取对象
        executorService.submit(runnable);
        executorService.submit(runnable);


    }
}
