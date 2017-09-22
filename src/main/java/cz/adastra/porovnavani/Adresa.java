package cz.adastra.porovnavani;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Adresa {
    private String ulice;
    private String cisloPopisni;
    private String cisloOrentacni;
    private String psc;
    private String mesto;

    public Adresa(String ulice, String cisloPopisni, String cisloOrentacni, String psc, String mesto) {
        this.ulice = ulice;
        this.cisloPopisni = cisloPopisni;
        this.cisloOrentacni = cisloOrentacni;
        this.psc = psc;
        this.mesto = mesto;
    }

    @Override
    public String toString() {
        return ulice + " " + cisloOrentacni + "/" +
                cisloPopisni + ", " + psc + " " +
                mesto;
    }
}
