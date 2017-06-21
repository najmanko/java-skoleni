package cz.adastra.oop.abstractp;

public class AbstrctClassImplementation extends AbstractClassSample {

    private int a,b;
    private String s;

    @Override
    void prinAllAttributes() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("s: " + s);
    }

    public static void main(String[] args) {
        AbstrctClassImplementation aci =
                new AbstrctClassImplementation();

        aci.prinAllAttributes();
        aci.printClassName();
    }
}
