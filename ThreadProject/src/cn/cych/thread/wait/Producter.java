package cn.cych.thread.wait;

//生产者
public class Producter implements Runnable {
    private Food food;

    public Producter(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            if (i % 2 == 0) {
                System.out.println("宫保鸡丁" + i);
                food.cook("宫保鸡丁", "酸甜可口");
            } else {
                System.out.println("回锅肉" + i);
                food.cook("回锅肉", "回味无穷");
            }
        }
    }
}
