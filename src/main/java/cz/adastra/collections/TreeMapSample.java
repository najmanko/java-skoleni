package cz.adastra.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();

        System.out.println("simpleTreeMap:");
        sample.simpleTreeMap();

        System.out.println("backwardTreeMap:");
        sample.backwardTreeMap();
    }

    private void simpleTreeMap() {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        fillMap(map);
        printMap(map);
    }

    private void backwardTreeMap() {
        Map<Integer, String> map = new TreeMap<Integer, String>(new Comparator<Integer>() { //lambda here!
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        fillMap(map);
        printMap(map);
    }

    private void printMap(Map<Integer, String> map) {
        for(Integer key : map.keySet()){
            System.out.println(map.get(key));
        }
    }

    private void fillMap(Map map) {
        map.put(2, "two");
        map.put(3, "three");
        map.put(1, "one");
    }
}
