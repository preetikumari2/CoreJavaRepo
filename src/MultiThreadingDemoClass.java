class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId() + " is Running");
    }

}

public class MultiThreadingDemoClass {
    public static void main(String[] args) {
        try{
            for(int i = 0; i < 5; i++){
                MyThread mythread = new MyThread();
                mythread.start();
            }
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
    }
}