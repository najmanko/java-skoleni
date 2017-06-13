package cz.adastra.arrarys;

import java.util.Random;

public class SimpleArray {

    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray();
        int[] pole = simpleArray.getRandomArray(10);
        
        int sum = 0;
        Integer min = null;
        Integer max = null;

        for (int i = 0; i < pole.length; i++) {
            System.out.println("pole[" + i + "] = " + pole[i]);
            
            sum = sum + pole[i];
            
            if(min == null) {
                min = pole[i];
            } else {
                if(pole[i] < min) {
                    min = pole[i];       
                }
            }
            if(max == null) {
                max = pole[i];
            } else {
                if(pole[i] > max) {
                    max = pole[i];
                }
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    private int[] getRandomArray(int size) {
        int[] pole = new int[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            pole[i] = random.nextInt(10);
        }
        return pole;
    }
}
