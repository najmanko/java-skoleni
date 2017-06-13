package cz.adastra.arrarys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting arraySorting = new ArraySorting();

        List<Integer> list = arraySorting.generateArray(10);

        Collections.sort(list);

        System.out.println("Sorted:");
        for (Integer i : list) {
            System.out.print(i + ", ");
        }
    }

    private List<Integer> generateArray(int size) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("Unsorted:");
        for (Integer i : list) {
            System.out.print(i + ", ");
        }

        System.out.println();
        return list;
    }
}
