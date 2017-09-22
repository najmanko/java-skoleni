package cz.adastra.oop.telesa;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Ctverec implements Teleso {

    protected int a;

    public Ctverec(int a) {
        this.a = a;
    }

    @Override
    public double getObjem() {
        return 0;
    }

    @Override
    public double getPovrch() {
        return a * a;
    }

    private int getA() {
        return a;
    }
}
