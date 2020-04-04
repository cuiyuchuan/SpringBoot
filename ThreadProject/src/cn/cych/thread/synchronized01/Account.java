package cn.cych.thread.synchronized01;

public class Account {

    private String accountNo;
    private Double balance;

    public Account(String accountNo, Double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    //异常线程机制，造成账户数据不统一
//    public void withDraw(Double money){
//        Double after = balance - money;
//        //保证当前线程不能快速执行结束
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        setBalance(after);
//
//    }

    /**
     * 异常线程机制，造成账户数据不统一
     */

    /**
     * t1线程执行遇到同步代码块，就去找this对象的锁，找到之后继续执行语句
     * 如果此时语句块尚未执行完毕，t2线程获得CPU时间，也执行到此，发现找不到对象锁，只能等待
     * t1线程执行结束，归还this的对象锁
     */

    //同步语句块，控制精确
//    public void withDraw(Double money) {
//        synchronized (this) {//共享对象
//            /**
//             * t1线程执行遇到同步代码块，就去找this对象的锁，找到之后继续执行语句
//             * 如果此时语句块尚未执行完毕，t2线程获得CPU时间，也执行到此，发现找不到对象锁，只能等待
//             * t1线程执行结束，归还this的对象锁
//             */
//            Double after = balance - money;
//            //保证当前线程不能快速执行结束
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            setBalance(after);
//        }
//    }
    //同步方法
    public synchronized void withDraw(Double money) {
        Double after = balance - money;
        //保证当前线程不能快速执行结束
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setBalance(after);
    }


    public Double checkMoney() {
        return balance;
    }
}
