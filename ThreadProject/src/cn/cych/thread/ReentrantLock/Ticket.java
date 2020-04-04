package cn.cych.thread.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements  Runnable {

    private int ticket = 100;
    //添加锁对象
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            // 加同步锁，此处开始获取到对象，并对属性值进行判断
            lock.lock();
            if (ticket > 0) {
                // 出票操作，模拟出票时间
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                lock.lock();
                System.out.println(Thread.currentThread().getName()+"售票："+ticket--);
//                lock.unlock();

            }
            //释放同步锁
            lock.unlock();
        }


    }
}
