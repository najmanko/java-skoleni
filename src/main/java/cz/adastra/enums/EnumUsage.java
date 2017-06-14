package cz.adastra.enums;

import java.util.Arrays;

public class EnumUsage {

    public static void main(String[] args) {
        Country defaultCountry = Country.CZECH_REPUBLIC;

        System.out.println("All contries:");
        Arrays.stream(Country.values()).forEach(
                country -> System.out.println(country.name())
        );

        int id1 = 52;
        int id2 = 2;

        Country resolveId1 = Country.fromNumber(id1);
        Country resolveId2 = Country.fromNumber(id2);

        System.out.println("id1: " + resolveId1);
        System.out.println("id2: " + resolveId2);

        if (defaultCountry == resolveId1) {
            System.out.println("Nasel jsem Cesko!");
        }
    }
}
