package cz.adastra.exceptions;

public class RuntimeExceptionSample {

    public static void main(String[] args) {
        RuntimeExceptionSample sample = new RuntimeExceptionSample();

        sample.nullPointerSample();

        int i = 5;

        //call exception
        if (i > 1) {
            throw new RuntimeException();
        }
    }

    private void nullPointerSample() {
        String value = null;

        if (value == null) {
            System.out.println("Value is null!!!");
        } else {
            value.contains("A");
        }
    }


}
