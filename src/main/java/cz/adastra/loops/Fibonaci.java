package cz.adastra.loops;

import java.math.BigInteger;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class Fibonaci {

    public static void main(String[] args) {
        Fibonaci fibonaci = new Fibonaci();

        BigInteger number = BigInteger.valueOf(35);
        
        long time = System.currentTimeMillis();
        System.out.println(number + ". fibonaci number is: " +
                fibonaci.fibonacciRek(number.intValue()));

        long took = System.currentTimeMillis() - time;
        System.out.println("fibonacciRek took " + took + " miliseconds.");

        time = System.currentTimeMillis();
        System.out.println(number + ". fibonaciho number is: " +
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

    private BigInteger fibonacciForLoop(BigInteger index) {
        if (index.compareTo(ONE) == 0) return ONE;
        if (index.compareTo(ZERO) == 0) return ZERO;
        BigInteger oneBeforeLast = ZERO;
        BigInteger last = ONE;
        BigInteger result = ZERO;
        for (BigInteger i = ONE; i.compareTo(index) < 0; i=i.add(ONE)) {
            result = oneBeforeLast.add(last);
            oneBeforeLast = last;
            last = result;
        }
        return result;
    }
}
