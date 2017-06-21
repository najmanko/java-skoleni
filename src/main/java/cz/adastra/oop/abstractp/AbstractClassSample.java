package cz.adastra.oop.abstractp;

public abstract class AbstractClassSample {

    abstract void prinAllAttributes();

    public void printClassName() {
        System.out.println(this.getClass());
    }
}
