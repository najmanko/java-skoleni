package ada.course.threads;

public class TestThread {

    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo( "First");
        R1.start();

        RunnableDemo R2 = new RunnableDemo( "Second");
        R2.start();
    }
}
