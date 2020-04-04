package cn.cych.thread.wait;

//消费者
public class Customer implements Runnable {

    private Food food;

    public Customer(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            food.enjoy();
        }
    }
}
