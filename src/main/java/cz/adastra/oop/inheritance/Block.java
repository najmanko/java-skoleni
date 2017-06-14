package cz.adastra.oop.inheritance;

public class Block extends Rectangle {

    public int c;

    @Override
    public int getSurface() {
        return (2 * a * b) + (2 * b + c) + (2 * a * c);
    }
}
