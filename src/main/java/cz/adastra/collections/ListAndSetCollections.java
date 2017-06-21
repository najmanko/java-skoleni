package cz.adastra.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListAndSetCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("1");

        for (String string : list) {
            System.out.println(string + ", ");
        }

        Set<String> set = new TreeSet<>();
        set.add("2");
        set.add("2");
        set.add("1");

        for (String string : list) {
            System.out.println(string + ", ");
        }
    }
}
