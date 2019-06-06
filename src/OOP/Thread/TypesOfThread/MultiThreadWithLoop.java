package OOP.Thread.TypesOfThread;

public class MultiThreadWithLoop {
    public static void main(String[] args) {
        int n = 0; // creating number thread
        for (int i = 0; i < n; i++){
            MultiThread_Demo demo = new MultiThread_Demo();
            demo.start();
            Thread obj = new Thread(new MultiThread_Runnable());
        }
    }
}
class MultiThread_Demo extends Thread{

    @Override
    public void run(){
        try{
            System.out.println("thread" + Thread.currentThread().getId() + "running");
        } catch (Exception e){
            System.out.println("Thread Exceptions");
        }
    }
}
class MultiThread_Runnable implements Runnable{


    @Override
    public void run() {
        try{
            System.out.println("thread" + Thread.currentThread().getId() + "running");
        } catch (Exception e){
            System.out.println("Thread Exceptions");

        }
    }
}