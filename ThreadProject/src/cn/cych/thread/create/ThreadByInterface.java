package cn.cych.thread.create;

public class ThreadByInterface implements Runnable {
    @Override
    public void run() {

        System.out.println("接口线程");

    }
}
