package OOP.Thread.TypesOfThread;

public class ThreadJoinDemoTwo {
    public static void main(String[] args) {
        Thread first = new Thread(new TryThreadJoin("A","a",200));
        Thread second = new Thread(new TryThreadJoin("B","b",200));
        Thread three = new Thread(new TryThreadJoin("C","c",200));

        first.start();
        second.start();
        three.start();

        try {
            first.join();
            second.join();
            three.join();
        }
        catch (InterruptedException e){
            System.out.println("Thread exceptions");
        }
    }
}
class TryThreadJoin implements Runnable{
    private String firstName;
    private String secondName;
    private long aWhile;
    private long total;
public TryThreadJoin(String firstName, String secondName, long aWhile) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.aWhile = aWhile;

}
@Override
    public void run(){
        try {
            while (total < 1000) {
                System.out.println(firstName);
                Thread.sleep(aWhile);
                total += aWhile;
                System.out.println(secondName + "\n");
            }

        } catch (InterruptedException e) {
            System.out.println(firstName + secondName + e);
        }
        System.out.println(secondName + "Thread stopped");
    }
}