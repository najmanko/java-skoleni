package cz.adastra.arrarys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorting {

    public static void main(String[] args) {
        StringSorting arraySorting = new StringSorting();

        List<String> list = arraySorting.generateArray(10);

        Collections.sort(list, (o1, o2) -> o1.compareToIgnoreCase(o2));

        System.out.println("Sorted:");
        for (String i : list) {
            System.out.print(i + ", ");
        }

        Collections.sort(list, (o1, o2) -> o2.compareToIgnoreCase(o1));

        System.out.println("\nSorted backward:");
        for (String i : list) {
            System.out.print(i + ", ");
        }
    }

    private List<String> generateArray(int size) {
        List<String> list = new ArrayList<>();

        list.add("Ahoj");
        list.add("ahoj");
        list.add("123");
        list.add("Čestmír");
        list.add("Xindl");
        list.add("Zebra");
        list.add("Beta");
        list.add("Cecil");
        list.add("1");
        list.add("23");

        System.out.println("Unsorted:");
        for (String i : list) {
            System.out.print(i + ", ");
        }

        System.out.println();
        return list;
    }
}
