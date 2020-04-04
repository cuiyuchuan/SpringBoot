package cn.cych.thread.waitAndNotify;

public class Num {

    private int a;

    public Num(int a) {
        this.a = a;
    }

    public  synchronized  void printOdd(){

        System.out.println(a);
        setA(a++);
        this.notifyAll();
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  synchronized  void printEvet(){

        System.out.println(a);
        setA(a++);
        this.notifyAll();
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  synchronized  void printNum(){

        System.out.println(a);
        setA(++a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
