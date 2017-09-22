package cz.adastra.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jozef.najman on 21.09.2017.
 */
public class Vyhledavani {

    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int j = new Random().nextInt(10);
            seznam.add(j);
            System.out.print(j + ", ");
        }
        System.out.println();

        Vyhledavani vyhledavani = new Vyhledavani();
        vyhledavani.getPrvniLicheCislo(seznam);
        vyhledavani.getPrvniLicheCisloAVypisHo(seznam);
        vyhledavani.vypisSudaCisla(seznam);
    }

    private void getPrvniLicheCislo(List<Integer> seznam) {
        for (Integer cislo : seznam) {
            if ((cislo % 2) == 1) {
                System.out.println("Prvni liche cislo je: " + cislo);
                return;
            }
        }
        System.out.println("Nenasel jsem nic!");
    }

    private void getPrvniLicheCisloAVypisHo(List<Integer> seznam) {
        int i = 0;
        for (Integer cislo : seznam) {
            if ((cislo % 2) == 1) {
                i = cislo;
                break;
            }
        }
        if (i == 0) {
            System.out.println("Nenasel jsem nic!");
        } else {
            System.out.println("Prvni liche cislo je: " + i);
        }
    }

    private void vypisSudaCisla(List<Integer> seznam) {
        for (Integer cislo : seznam) {
            if ((cislo % 2) == 0) {
                System.out.println("Sude: " + cislo);
            } else {
                continue;
            }
            System.out.println("Nasel sem sude cislo!");
        }
    }
}
