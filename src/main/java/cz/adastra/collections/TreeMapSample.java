package cz.adastra.collections;

import java.util.*;

public class TreeMapSample {

    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();

        System.out.println("simpleTreeMap:");
        sample.simpleTreeMap();

        System.out.println("backwardTreeMap:");
        sample.backwardTreeMap();

        System.out.println("hashMap:");
        sample.createHashMap();

        System.out.println("linkedHashMap:");
        sample.createLinkedHashMap();
    }

    private void createLinkedHashMap() {
        Map<Integer, String> map = new LinkedHashMap<>();
        fillMap(map);
        printMap(map);
    }

    private void createHashMap() {
        Map<Integer, String> map = new HashMap<>();
        fillMap(map);
        printMap(map);
    }

    private void simpleTreeMap() {
        Map<Integer, String> map = new TreeMap<>();
        fillMap(map);
        printMap(map);
    }

    private void backwardTreeMap() {
        Map<Integer, String> map = new TreeMap<>((o1, o2) -> o2.compareTo(o1));
        fillMap(map);
        printMap(map);
    }

    private void printMap(Map<Integer, String> map) {
        for(Integer key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }

    private void fillMap(Map map) {
        map.put(2, "two");
        map.put(3, "three");
        map.put(7, "seven");
        map.put(4, "four");
        map.put(11, "one");
    }
}
