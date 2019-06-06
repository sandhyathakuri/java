package OOP.Thread.TypesOfThread;

public class synchronized_Intro {
    int num = 0;
    public   synchronized int incrementNum(){
        return num++;
    }

    public static void main(String[] args)  throws  InterruptedException{

        synchronized_Intro intro = new synchronized_Intro();

        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++){
                   intro.incrementNum();
                }
                System.out.println( "This is t1 " +intro.num);
            }
        };

        Thread t1 = new Thread(runnableA, "t1");
        t1.start();
        Runnable runnableB = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++ ){
                   intro.incrementNum();
                }
                System.out.println("This is t2 " + intro.num);
            }
        };

        Thread t2 = new Thread(runnableB ,"t2");

        t2.start();
        t1.join();
        t2.join();

    }
}
