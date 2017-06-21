package cz.adastra.operators;

public class Rectangle {

    private int sirka;
    private int vyska;

    public Rectangle(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    public int getSirka() {
        return sirka;
    }

    public int getVyska() {
        return vyska;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (sirka != rectangle.sirka) return false;
        return vyska == rectangle.vyska;
    }

    @Override
    public int hashCode() {
        int result = sirka;
        result = 31 * result + vyska;
        return result;
    }
}
