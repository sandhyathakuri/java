package OOP.Thread.TypesOfThread;

import java.io.IOException;

public class TryThread_Main {
    public static void main(String[] args) {
        Thread first = new Thread(new TryThisThread("T1", "t1", 200));
        Thread second = new Thread(new TryThisThread("T2", "t2", 300));
        Thread three = new Thread(new TryThisThread("T3", "t3", 400));
        first.start();
        second.start();
        three.start();

        first.stop();
        second.stop();
        try{
            System.in.read();
            System.out.println("Enter press...\n");
        }catch (IOException e){
            System.out.println(e);
        }
            System.out.println("Ending Main");
    }
}
class TryThisThread implements Runnable{

    private String firstName;
    private String secondName;
    private long aWhile;

    public TryThisThread(String firstName, String secondName, long aWhile){
        this.firstName = firstName;
        this.secondName = secondName;
        this.aWhile = aWhile;
    }
    @Override
    public void run() {
        try{
            while (true){
                System.out.println(firstName);
                Thread.sleep(aWhile);
                System.out.println(secondName + "\n");
            }
        }catch (InterruptedException e){
            System.out.println(firstName + secondName + e);
        }
    }


}