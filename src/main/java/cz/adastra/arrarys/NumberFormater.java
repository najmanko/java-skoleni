package cz.adastra.arrarys;

public class NumberFormater {

    public static void main(String[] args) {
        long number = 9654321;

        String numString = String.valueOf(number);
        int tmp = 0;
        String tmpString = "";

        for (int i = numString.length() - 1; i >= 0; i--) {
            if (tmp > 0 && tmp % 3 == 0) {
                tmpString = " " + tmpString;
            }
            tmpString = numString.charAt(i) + tmpString;
            ++tmp;
        }

        System.out.println("Cena: " + tmpString + " Kc");
    }
}
