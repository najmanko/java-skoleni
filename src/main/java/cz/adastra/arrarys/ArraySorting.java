package cz.adastra.arrarys;

import java.util.*;

public class ArraySorting {

    public static void main(String[] args) {
        ArraySorting arraySorting = new ArraySorting();

        List<Integer> list = arraySorting.generateArray(10);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Sorted:");
        for (Integer i : list) {
            System.out.print(i + ", ");
        }

        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));

        System.out.println("\nSorted backward:");
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
