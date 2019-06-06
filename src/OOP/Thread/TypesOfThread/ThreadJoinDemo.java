package OOP.Thread.TypesOfThread;

public class ThreadJoinDemo implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread" + t.getName());

        // how to check if the thread is still alive
        System.out.println("Is alive ? " + t.isAlive());
    }


    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ThreadJoinDemo());
        t.start();

        //wait for 1000 ms then this thread will die
        t.join(1000);
        System.out.println("\n Joining after 1000 ms");
        System.out.println("Current thread " + t.getName());

        //check if thread is alive or not
        System.out.println("Is Alive " + t.isAlive());
    }


    }
