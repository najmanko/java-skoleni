package cz.adastra.primitives;

public class TypeChangeExamples {
    //secti short + short

    public static void main(String[] args) {
        TypeChangeExamples examples = new TypeChangeExamples();
        
        System.out.println("byteSum:");
        examples.byteSum();

        System.out.println("shortSum:");
        examples.shortSum();

        System.out.println("intSum:");
        examples.intSum();

        System.out.println("longSum:");
        examples.longSum();

        System.out.println("floatSum:");
        examples.floatSum();

        System.out.println("doubleSum:");
        examples.doubleSum();
    }

    private void byteSum() {
        byte first = 1;
        byte second = 2;

        Object o = first + second;

        System.out.println(o.getClass());
    }

    private void shortSum() {
        short first = 1;
        short second = 2;

        Object o = first + second;

        System.out.println(o.getClass());
    }

    private void intSum() {
        int first = 1;
        
        int second = 2;

        Object o = first + second;

        System.out.println(o.getClass());
    }

    private void longSum() {
        long first = 1;
        long second = 2;

        Object o = first + second;

        System.out.println(o.getClass());
    }

    private void floatSum() {
        float first = 1;
        int second = 2;

        Object o = first + second;

        System.out.println(o.getClass());
    }

    private void doubleSum() {
        double first = 1;
        int second = 2;

        Object o = first + second;

        System.out.println(o.getClass());
    }
    
    //try reduce code
}
