package cn.cych.thread.create;

public class TestThreadOne {
    public static void main(String[] args) {

        //声明类继承方式的线程
        ThreadByExtend threadByExtend = new ThreadByExtend();

        //声明接口实现方式的线程
        Runnable threadByInterface = new ThreadByInterface();
        Thread threadInterface = new Thread(threadByInterface);

        System.out.println("-----------");
        //设置线程名称
        threadByExtend.setName("new线程");

        //设置线程优先级  1-10  由低到高
        threadByExtend.setPriority(Thread.MAX_PRIORITY);
        threadInterface.setPriority(Thread.NORM_PRIORITY);
        //启动线程
        threadByExtend.start();
        threadInterface.start();
        try {
            //设置主线程等待
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------");

    }
}
