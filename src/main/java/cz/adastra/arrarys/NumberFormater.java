package cz.adastra.arrarys;

public class NumberFormater {

    public static void main(String[] args) {
        long number = 987654321;

        String numString = String.valueOf(number);
        int tmp = 0;
        String tmpString = "";

        for (int i = numString.length() - 1; i >= 0; i--) {
            if (tmp % 3 == 0) {
                tmpString = tmpString + " ";
            }
            tmpString = tmpString + numString.charAt(i);
            ++tmp;
        }

        System.out.println(tmpString);
        StringBuilder builder = new StringBuilder();
        builder.append(tmpString);
        builder.reverse();

        System.out.println("Cislo: " + builder.toString());
    }
}
