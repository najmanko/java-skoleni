package cz.adastra.enums;

public enum Country {
    CZECH_REPUBLIC(52, "+2"),
    SLOVAKIA(555, "+2");

    private int number;
    private String timeZone;

    Country(int number, String timezone) {
        this.number = number;
        this.timeZone = timezone;
    }
    
    public static Country fromNumber(int number) {
        for (Country country : Country.values()) {
            if (country.number == number) {
                return country;
            }
        }
        return null;
    }
}
