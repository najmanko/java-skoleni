package cz.adastra.threads;

public class TestThread {

    public static void main(String args[]) {
        RunnableDemo t1 = new RunnableDemo( "First");
        t1.start();

        RunnableDemo t2 = new RunnableDemo( "Second");
        t2.start();
    }
}
