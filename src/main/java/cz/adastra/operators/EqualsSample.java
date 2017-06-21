package cz.adastra.operators;

public class EqualsSample {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3,4);
        Rectangle rectangle2 = new Rectangle(3,4);
        Rectangle rectangle3 = rectangle1;

        System.out.println("rectangle1 == rectangle2: " +
                (rectangle1 == rectangle2));
        System.out.println("rectangle2 == rectangle3: " +
                (rectangle2 == rectangle3));
        System.out.println("rectangle3 == rectangle1: " +
                (rectangle3 == rectangle1));

        Rectangle xy = null;
        System.out.println("rectangle1.equals(rectangle2): " +
                (rectangle1.equals(rectangle2)));
        System.out.println("rectangle2.equals(rectangle3): " +
                (rectangle2.equals(rectangle3)));
        System.out.println("rectangle3.equals(rectangle1): " +
                (rectangle3.equals(xy)));

        //instanceof
        Object o = "objekt typu string";
        String s1 = "objekt typu string";
        String s2 = new String("objekt typu string");

        System.out.println("o == s1: " + (o == s1));
        System.out.println("o == s2: " + (o == s2));
        System.out.println("s1 == s2: " + (s1 == s2));

        if (o instanceof Rectangle) {
            System.out.println("o is a rectangle");
        } else {
            System.out.println("o is not a rectangle");
        }
    }
}
