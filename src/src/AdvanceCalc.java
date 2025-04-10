/**
 * Program:     Calculator
 * @author Jacob Schamp && Rania Hassani
 * @link <https://github.com/jascha10/Calculator-App.git> <github>
 */
/**
 * The AdvanceCalc class extends the Calculator class and adds advanced features
 * like memory operations and square root calculation. It also allows setting
 * the number of decimal places for output precision.
 */
public class AdvanceCalc extends Calculator {

    /**
     * Stores the memory value used in memory operations.
     */
    double memory = 0.0;

    /**
     * Adds the current value from the calculator to memory.
     * Displays the value that was added.
     */
    public void memoryAdd() {
        memory += currentValue;
        System.out.printf("Memory Add %,.2f%n", currentValue);
    }

    /**
     * Subtracts the current value from memory and updates the memory.
     * Displays the difference between the current value and the memory before subtraction.
     */
    public void memorySubtract() {
        double diff = currentValue - memory;
        memory -= currentValue;
        System.out.printf("Memory Subtract %,.2f%n", diff);
    }

    /**
     * Clears the memory by setting it back to 0.
     * Displays a message confirming the memory was cleared.
     */
    public void clearMemory() {
        memory = 0.0;
        System.out.printf("Memory Cleared %,.4f%n", memory);
    }

    /**
     * Calculates the square root of a given value.
     * Updates the calculator's current and previous values and
     * displays the result with the current precision setting.
     *
     * @param value The number to calculate the square root of.
     */
    public void sqrt(double value) {
        previousValue = value;
        currentValue = Math.sqrt(value);
        System.out.printf("√ %,." + precision + "f%n", previousValue);
        System.out.println("=============");
        System.out.printf("%,." + precision + "f%n", currentValue);
        System.out.println();
    }

    /**
     * Sets the number of decimal places (precision) for displaying results.
     * Only accepts values between 0 and 10.
     * Displays an error message if the input is out of range.
     *
     * @param precision The number of decimal places to use (0–10).
     */
    public void setPrecision(int precision) {
        if (precision < 0 || precision > 10) {
            System.out.println("Error: Precision must be between 0 and 10");
            return;
        }
        this.precision = precision;
        System.out.println("Calculator Precision is " + precision + " decimal places.");
    }
}
