package cz.adastra.primitives;

public class PrimitiveBorders {
    
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        System.out.println("MAX + 1");
        System.out.println(INT_MAX);
        System.out.println(INT_MAX + 1);
        System.out.println((INT_MAX + 1) == INT_MIN);

        System.out.println("MIN - 1");
        System.out.println(INT_MIN);
        System.out.println(INT_MIN - 1);
        System.out.println((INT_MIN - 1) == INT_MAX);

        System.out.println("MAX * 2");
        System.out.println(INT_MAX);
        System.out.println(INT_MAX * 2);

        System.out.println("MIN * 2");
        System.out.println(INT_MIN);
        System.out.println(INT_MIN * 2);
    }
}
