package cn.cych.thread.pool;

public class SwimRunnable implements  Runnable {

    @Override
    public void run() {
        System.out.println("我需要一个游泳教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了："+Thread.currentThread().getName());
        System.out.println("教练任务完成，回到泳池");
    }
}
