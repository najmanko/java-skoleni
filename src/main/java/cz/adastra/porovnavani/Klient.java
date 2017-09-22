package cz.adastra.porovnavani;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Klient {

    String jmeno;
    String prijmeni;
    Adresa adresa;
    String rodneCislo;
    int vek;

    public static void main(String[] args) {
        Klient klient = new Klient();
        klient.jmeno = "Jozko";
        klient.prijmeni = "Mrkvicka";
        klient.rodneCislo = "123456789";
        klient.vek = 50;

        Adresa adresa = new Adresa(
                "Nardoni",
                "1",
                "2",
                "10000",
                "Praha");

        klient.adresa = adresa;

        System.out.println(klient);
    }



    @Override
    public String toString() {
        return "Jmeno: " + jmeno +
                ", Prijmeni: " + prijmeni +
                ", Adresa: " + adresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klient klient = (Klient) o;

        if (jmeno != null ? !jmeno.equals(klient.jmeno) : klient.jmeno != null) return false;
        if (prijmeni != null ? !prijmeni.equals(klient.prijmeni) : klient.prijmeni != null) return false;
        if (adresa != null ? !adresa.equals(klient.adresa) : klient.adresa != null) return false;
        return rodneCislo != null ? rodneCislo.equals(klient.rodneCislo) : klient.rodneCislo == null;
    }

    @Override
    public int hashCode() {
        int result = jmeno != null ? jmeno.hashCode() : 0;
        result = 31 * result + (prijmeni != null ? prijmeni.hashCode() : 0);
        result = 31 * result + (adresa != null ? adresa.hashCode() : 0);
        result = 31 * result + (rodneCislo != null ? rodneCislo.hashCode() : 0);
        return result;
    }
}
