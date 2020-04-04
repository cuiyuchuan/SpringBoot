package cn.cych.thread.synchronized01;

public class TestDrawMoney {
    public static void main(String[] args) {
        Account account = new Account("3355",5000.0);
        Thread t1 = new Thread(new Processor(account));
        Thread t2 = new Thread(new Processor(account));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account.getBalance());
    }
}
