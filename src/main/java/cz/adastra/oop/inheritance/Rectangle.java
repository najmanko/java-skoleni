package cz.adastra.oop.inheritance;

public class Rectangle extends Square {

    public int b;

    @Override
    public int getSurface() {
        return a * b;
    }
}
