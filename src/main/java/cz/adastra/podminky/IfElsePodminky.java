package cz.adastra.podminky;

/**
 * Trida vytvorena na skoleni
 */
public class IfElsePodminky {

    /**
     * Toto je nemaky popis
     *
     * @param args
     */
    public static void main(String[] args) {
        long cas = System.currentTimeMillis();
        for (int j = 1; j <= 1000; j++) {
            for (int i = 1; i <= 8; i++) {
                if (i == 1) {
                    System.out.println("Pondeli");
                } else if (i == 2) {
                    System.out.println("Utery");
                } else if (i == 3) {
                    System.out.println("Streda");
                } else if (i == 4) {
                    System.out.println("Ctvrtek");
                } else if (i == 5) {
                    System.out.println("Patek");
                } else if (i == 6) {
                    System.out.println("Sobota");
                } else if (i == 7) {
                    System.out.println("Nedele");
                } else {
                    System.out.println("Takovy den neni!");
                }
            }
        }
        cas = System.currentTimeMillis() - cas;
        System.out.println("Cas v milisekundach: " + cas);
    }
}
