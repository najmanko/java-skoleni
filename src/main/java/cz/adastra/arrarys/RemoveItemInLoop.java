package cz.adastra.arrarys;

import java.util.ArrayList;
import java.util.List;

public class RemoveItemInLoop {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 23; i < 100; i=i+3) {
            list.add(i);
        }

        System.out.println(list.size());

        List<Integer> cleanList = new ArrayList<>();

        for (Integer integer : list) {
            if (integer % 5 == 0) {
                //list.remove(integer);
                continue;
            }
            cleanList.add(integer);
        }

        System.out.println("List size: " + list.size());
        System.out.println("CleanList size: " + cleanList.size());
    }
}
