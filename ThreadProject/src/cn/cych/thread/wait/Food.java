package cn.cych.thread.wait;

public class Food {

    private String foodName;
    private String foodTaste;
    private boolean falg = true;

    public Food() {
    }

    public Food(String foodName, String foodTaste) {
        this.foodName = foodName;
        this.foodTaste = foodTaste;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodTaste() {
        return foodTaste;
    }

    public void setFoodTaste(String foodTaste) {
        this.foodTaste = foodTaste;
    }

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }

    /**
     * 初始值flag = false时，cook()所在的线程处于正常执行状态，enjoy()所在的线程处于wait()状态被挂起，
     * 当执行到cook()方法的61行时，flag = false,enjoy()所在的线程被唤醒，这时，cook()所在的线程处于wait()状态被挂起，
     * 依次循环，所以每次都是先生产再消费，这就是生产者与消费者模式
     */
    //生产
    public synchronized void cook(String foodName, String foodTatse) {
        if (!falg) {//true 说明
            try {
                this.wait();//当前线程进入等待状态，让出CPU并且释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setFoodName(foodName);
        this.setFoodTaste(foodTatse);

        try {
            Thread.sleep(1000);//
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        falg = false;
        this.notify();


    }

    //消费
    public synchronized void enjoy() {
        if (falg) {//true 说明生产者还未cook食物
            try {
                this.wait();//当前线程进入等待状态，让出CPU并且释放锁，让生产者去生产
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("享受" + this.getFoodName() + "" + this.getFoodTaste());
        try {
            Thread.sleep(1000);//让出CPU时间，但是不释放锁
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        falg = true;
        this.notify();
    }
}
