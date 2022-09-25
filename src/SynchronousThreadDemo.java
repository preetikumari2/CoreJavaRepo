class MessageSender{
    public void send(String message){
        System.out.println("Sender is sending the message" + message);
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}

class ThreadSender extends Thread{
    final private String message;
    MessageSender messageSender;
    ThreadSender(String str, MessageSender ms){
        message = str;
        messageSender = ms;
    }

    @Override
    public void run(){
        synchronized(messageSender){
            messageSender.send(message);
        }
    }
}

public class SynchronousThreadDemo {
    public static void main(String[] args) {
        MessageSender message = new MessageSender();
        ThreadSender t1 = new ThreadSender(" I am thread one sending the message", message);
        ThreadSender t2 = new ThreadSender(" I am another thread sending the message", message);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}