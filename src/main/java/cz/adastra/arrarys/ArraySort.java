package cz.adastra.arrarys;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by jozef.najman on 20.09.2017.
 */
public class ArraySort {

    public static void main(String[] args) {
        int[] pole = new int[10];

        for (int i = 0; i < pole.length; i++) {
            pole[i] = new Random().nextInt(10);
        }
        for (int j : pole) {
            System.out.print(j + ", ");
        }
        System.out.println();

        Arrays.sort(pole);

        for (int j : pole) {
            System.out.print(j + ", ");
        }
        System.out.println();

        for (int k = 0; k < pole.length; k++) {
            for (int l = k; l < pole.length; l++) {
                if(pole[l] < pole[k]) {
                    int tmp = pole[l];
                    pole[l] = pole[k];
                    pole[k] = tmp;
                }
            }
        }
        for (int j : pole) {
            System.out.print(j + ", ");
        }
    }
}
