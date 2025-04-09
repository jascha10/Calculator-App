public class AdvanceCalc extends MemoryCalc implements AdvanceMath {
    int precision = 0; // Default precision

    // Override updateDisplay() to include precision and handle sqrt operator
    @Override
    public void updateDisplay() {
        String format1 = " %,12." + precision + "f%n";
        String format2 = "%1s%,12." + precision + "f%n";

        if (operator == '\u221A') {  // Square root symbol
            System.out.printf(format2, operator, previousValue);
        } else {
            System.out.printf(format1, previousValue);
            System.out.printf(format2, operator, inputValue);
        }

        System.out.println("==============");
        System.out.printf(format1, currentValue);
        System.out.println();
    }

    // Implement sqrt() method from AdvanceMath interface
    @Override
    public double sqrt(double value) {
        operator = '\u221A'; // Square root symbol
        previousValue = value;
        currentValue = Math.sqrt(value);
        updateDisplay(); // Update display with the result
        return currentValue; // Return the result of sqrt
    }

    // Set precision, only accepts values between 0 and 10
    @Override
    public void setPrecision(int precision) {
        if (precision < 0 || precision > 10) {
            System.out.println("Error: Precision must be between 0 and 10");
            return;
        }
        this.precision = precision;
        System.out.println("Calculator Precision is " + precision + " decimal places.");
    }
}
