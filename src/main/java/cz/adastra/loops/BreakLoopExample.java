package cz.adastra.loops;

public class BreakLoopExample {

    public static void main(String[] args) {
        BreakLoopExample example = new BreakLoopExample();
        
        example.breakLoop();

        System.out.println("End of class");
    }

    private void breakLoop() {
        
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd: " + i);
            if (i == 5) {
                break;
            }
        }

        System.out.println("End of loop.");
    }
}
