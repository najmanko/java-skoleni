package cz.adastra.arrarys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jozef.najman on 22.09.2017.
 */
public class Prvocisla {

    public static void main(String[] args) {
        List<Integer> prvocisla = new ArrayList<>();

        for (int i = 2; i < 100; i++) {
            boolean isPrvocislo = true;
            for (Integer cislo : prvocisla) {
                if (i % cislo == 0) {
                    isPrvocislo = false;
                    break;
                }
            }
            if (isPrvocislo) {
                prvocisla.add(i);
            }
        }

        System.out.print("1, ");
        for (Integer cislo : prvocisla) {
            System.out.print(cislo + ", ");
        }
    }
}
