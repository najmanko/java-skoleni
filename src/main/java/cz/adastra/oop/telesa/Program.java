package cz.adastra.oop.telesa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Program {

    public static void main(String[] args) {

        List<Teleso> seznam = new ArrayList<>();

        seznam.add(new Ctverec(4));
        seznam.add(new Obdelnik(2,3));
        seznam.add(new Koule(5));
        seznam.add(new Kostka(3));
        seznam.add(new Kvader(3,5,1));
        seznam.add(new Kvader(3,4,2));

        for (Teleso teleso : seznam) {
            System.out.println("Trida: " + teleso.getClass() );
            System.out.println("Objem: " + teleso.getObjem() );
            System.out.println("Povrch: " + teleso.getPovrch() );
        }
    }
}
