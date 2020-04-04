package cn.cych.thread.deadLock;

public class TestDeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Thread(new T1(o1,o2));
        Thread t2 = new Thread(new T2(o1,o2));
        t1.start();
        t2.start();
    }
}
