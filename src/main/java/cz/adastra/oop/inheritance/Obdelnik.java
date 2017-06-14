package cz.adastra.oop.inheritance;

public class Obdelnik extends Ctverec {

    public int b;

    @Override
    public int getPovrch() {
        return a * b;
    }
}
