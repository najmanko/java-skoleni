package cz.adastra.oop.telesa;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Obdelnik extends Ctverec {

    int b;

    public Obdelnik(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public double getPovrch() {
        return a * b;
    }
}
