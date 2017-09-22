package cz.adastra.oop.telesa;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Kostka extends Ctverec {
    public Kostka(int a) {
        super(a);
    }

    @Override
    public double getObjem() {
        return a * a * a;
    }

    @Override
    public double getPovrch() {
        return a * a * 6;
    }
}
