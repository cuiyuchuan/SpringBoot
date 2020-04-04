package cn.cych.thread.wait;

public class TestWait {

    public static void main(String[] args) {
        Food food = new Food();
        Thread customer = new Thread(new Customer(food));
        Thread producter = new Thread(new Producter(food));
        customer.start();
        producter.start();
    }
}
