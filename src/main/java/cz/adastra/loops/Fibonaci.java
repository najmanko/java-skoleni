package cz.adastra.loops;

public class Fibonaci {

    public static void main(String[] args) {
        Fibonaci fibonaci = new Fibonaci();

        for (int i = 1; i <= 10; i++) {
            int result = fibonaci.fibonacciRek(i);
            System.out.println(i + ": " + result);
        }

        for (int i = 1; i <= 10; i++) {
            int result = fibonaci.fibonacciForLoop(i);
            System.out.println(i + ": " + result);
        }

        int number = 30;
        
        long time = System.currentTimeMillis();
        System.out.println(number + ". fibonaciho cislo je: " +
                fibonaci.fibonacciRek(number));

        long took = System.currentTimeMillis() - time;
        System.out.println("fibonacciRek took " + took + " miliseconds.");

        time = System.currentTimeMillis();
        System.out.println(number + ". fibonaciho cislo je: " +
                fibonaci.fibonacciForLoop(number));

        took = System.currentTimeMillis() - time;
        System.out.println("fibonacciForLoop took " + took + " miliseconds.");
        
        
    }

    private int fibonacciRek(int index) {
        if (index == 1) return 1;
        if (index == 0) return 0;
        return fibonacciRek(index - 1) + 
                    fibonacciRek(index - 2);
    }

    private int fibonacciForLoop(int index) {
        if (index == 1) return 1;
        if (index == 0) return 0;
        int oneBeforeLast = 0;
        int last = 1;
        int result = 0;
        for (int i = 1; i < index; i++) {
            result = oneBeforeLast + last;
            oneBeforeLast = last;
            last = result;
        }
        return result;
    }
}
