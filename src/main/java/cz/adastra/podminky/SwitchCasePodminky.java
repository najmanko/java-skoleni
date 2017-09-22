package cz.adastra.podminky;

/**
 * Created by jozef.najman on 20.09.2017.
 */
public class SwitchCasePodminky {
    public static void main(String[] args) {
        long cas = System.currentTimeMillis();
        for (int j = 1; j <= 1000; j++) {
            for (int i = 1; i <= 8; i++) {
                switch (i) {
                    case 1:
                        System.out.println("Pondeli");
                        break;
                    case 2:
                        System.out.println("Utery");
                        break;
                    case 3:
                        System.out.println("Streda");
                        break;
                    case 4:
                        System.out.println("Ctvrtek");
                        break;
                    case 5:
                        System.out.println("Patek");
                        break;
                    case 6:
                        System.out.println("Sobota");
                        break;
                    case 7:
                        System.out.println("Nedele");
                        break;
                    default:
                        System.out.println("Takovy den neni!");
                }
            }
        }
        cas = System.currentTimeMillis() - cas;
        System.out.println("Cas v milisekundach: " + cas);
    }
}
