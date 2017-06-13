package cz.adastra.loops;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IncreaseCalculator {
    
    private static final int DAYS_IN_YEAR = 365;
    
    BigDecimal amount = BigDecimal.valueOf(50000);
    BigDecimal increase = BigDecimal.valueOf(0.01); //1%

    public static void main(String[] args) {
        IncreaseCalculator calculator = new IncreaseCalculator();
        
        BigDecimal dailyIncrease = calculator.increase.divide(
                BigDecimal.valueOf(DAYS_IN_YEAR),
                10, RoundingMode.HALF_UP);
        
        for (int i = 1; i <= DAYS_IN_YEAR; i++) {
            BigDecimal change = calculator.amount.multiply(dailyIncrease);
            calculator.amount = calculator.amount.add(change);
        }
        
        System.out.println("Zustatek: " + calculator.amount);
    }
}
