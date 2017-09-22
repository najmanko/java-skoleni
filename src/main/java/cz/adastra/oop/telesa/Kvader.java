package cz.adastra.oop.telesa;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Kvader extends Obdelnik {

    int c;

    public Kvader(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getObjem() {
        return a * b * c;
    }

    @Override
    public double getPovrch() {
        return (2 * a * b) + (2 * b * c) + (2 * a * c);
    }
}
