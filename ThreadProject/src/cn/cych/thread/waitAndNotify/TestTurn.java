package cn.cych.thread.waitAndNotify;

public class TestTurn {
    public static void main(String[] args) {
        Num num = new Num(0);
        Runnable r1 = new TurnThread(num);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();

    }
}
