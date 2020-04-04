package cn.cych.thread.synchronized01;

public class Processor implements Runnable {
    //声明共享账户
    private Account account;

    public Processor(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        //从账户中取款 5000元
        account.withDraw(5000.0);
        System.out.println(Thread.currentThread().getName()+"取款成功5000.0");

    }
}
