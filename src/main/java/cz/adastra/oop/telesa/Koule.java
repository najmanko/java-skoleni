package cz.adastra.oop.telesa;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Koule implements Teleso {

    int r;

    public Koule(int r) {
        this.r = r;
    }

    @Override
    public double getObjem() {
        return 4/3 * Math.PI * r * r * r;
    }

    @Override
    public double getPovrch() {
        return r * r * Math.PI * 4;
    }
}
