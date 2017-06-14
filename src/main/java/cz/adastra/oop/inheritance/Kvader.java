package cz.adastra.oop.inheritance;

public class Kvader extends Obdelnik {

    public int c;

    @Override
    public int getPovrch() {
        return (2 * a * b) + (2 * b + c) + (2 * a * c);
    }
}
