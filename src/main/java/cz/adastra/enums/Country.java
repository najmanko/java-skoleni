package cz.adastra.enums;

public enum Country {
    CZECH_REPUBLIC(52),
    SLOVAKIA(555);

    private int number;

    Country(int number) {
        this.number = number;
    }
    
    public Country fromNumber(int number) {
        for (Country country : Country.values()) {
            if (country.number == number) {
                return country;
            }
        }
        return null;
    }
}
