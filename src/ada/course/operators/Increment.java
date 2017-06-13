package ada.course.operators;

public class Increment {

    public static void main(String[] args) {
        Increment increment = new Increment();
        increment.plusPlusFirst();
        increment.plusPlusLast();
    }
    
    private void plusPlusFirst() {
        int i = 1;
        System.out.println("plusPlusFirst:");
        System.out.println(++i);
        System.out.println(i);
    }
    
    private void plusPlusLast() {
        int i = 1;
        System.out.println("plusPlusLast:");
        System.out.println(i++);
        System.out.println(i);
    }
}
