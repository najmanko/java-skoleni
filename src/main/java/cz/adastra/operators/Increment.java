package cz.adastra.operators;

import java.math.BigDecimal;

import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.valueOf;

public class Increment {

    private static BigDecimal MAX_USABLE_VALUE = new BigDecimal(-110.23);

    public static void main(String[] args) {
        for (BigDecimal fi = valueOf(0.23);
             fi.compareTo(MAX_USABLE_VALUE) > 0;
             fi = fi.subtract(ONE)) {
            System.out.print(fi + ", ");
        }
        System.out.println();
        System.out.println();

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
