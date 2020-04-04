package cn.cych.thread.deadLock;

public class T1 implements Runnable {
    private Object o1;
    private Object o2;

    public T1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            System.out.println("t1线程获得o1对象锁，等待O2");
            //保证死锁现象出现
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){
                System.out.println("t1线程获得o2对象锁，执行成功");
            }
        }
    }
}
