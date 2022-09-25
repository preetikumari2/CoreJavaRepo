class MyThread1 implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getId() + " is Running");
    }
}

public class MultiThreadingDemoInterface {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                Thread myThread = new Thread(new MyThread1());
                myThread.start();
            }
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
