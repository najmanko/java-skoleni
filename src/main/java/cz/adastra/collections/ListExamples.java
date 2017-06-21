package cz.adastra.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        ListExamples examples = new ListExamples();
        examples.oldUseOfListUnderJava5();

        examples.newUsageAfterJava5();
    }

    private void oldUseOfListUnderJava5() {
        List arrayList = new ArrayList();
        arrayList.add(7);
        arrayList.add("Hi!");
        arrayList.add(false);

        for (int i = 0; i < arrayList.size(); i++) {
            Object o = arrayList.get(i);
            System.out.print("I found ");
            if (o instanceof Integer) {
                int number = (Integer)o;
                System.out.println("Integer: " + number);
            } else if (o instanceof String) {
                String slovo = (String)o;
                System.out.println("String: " + slovo);
            } else if (o instanceof Boolean) {
                boolean hodnota = (Boolean)o;
                System.out.println("Boolean: " + hodnota);
            }
            System.out.println(o);
        }
    }

    private void newUsageAfterJava5() {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(6);
        integerList.add(-10);
        integerList.add(Integer.MAX_VALUE);

        for (Integer i : integerList) {
            System.out.println("Number: " + i);
        }
    }
}
