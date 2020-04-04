package cn.cych.thread.waitAndNotify;

public class TurnThread implements Runnable {

    Num num;

    public TurnThread(Num num) {
        this.num = num;
    }

    @Override
    public synchronized void run() {
        while (num.getA() < 100){
            if (num.getA() % 2 == 0) {
                if (Thread.currentThread().getName().equals("t2")) {
                    System.out.println("t2");
                    num.printNum();
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else if (num.getA() % 3 == 0){
                if (Thread.currentThread().getName().equals("t3")) {
                    System.out.println("t3");
                    num.printNum();
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else{
                if (Thread.currentThread().getName().equals("t1")) {
                    System.out.println("t1");
                    num.printNum();
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        notifyAll();


    }

}
