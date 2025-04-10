/**
 * Program:     Calculator
 * @author Jacob Schamp && Rania Hassani
 * @link <https://github.com/jascha10/Calculator-App.git> <github>
 */
/**
 * MemoryCalc is a simple calculator that adds memory functions
 * on top of the basic calculator features like add, subtract, etc.
 * You can store a number in memory, add or subtract from it, and clear it.
 * It reuses all the basic math logic from the Calculator class.
 */
public class MemoryCalc extends Calculator {

    /**
     * Stores the memory value that can be used to add or subtract later.
     */
    double memoryValue = 0.0;

    /**
     * Adds the current value from the calculator to memory.
     * Then prints out the updated memory.
     */
    public void memoryAdd() {
        memoryValue += currentValue;
        System.out.println("Memory Add " + String.format("%,.4f", memoryValue));
    }

    /**
     * Subtracts the current value from the memory.
     * Then prints out the updated memory.
     */
    public void memorySubtract() {
        memoryValue -= currentValue;
        System.out.println("Memory Subtract " + String.format("%,.4f", memoryValue));
    }

    /**
     * Clears the memory by setting it back to 0.
     * Then prints out the cleared memory value.
     */
    public void clearMemory() {
        memoryValue = 0.0;
        System.out.println("Memory Cleared " + String.format("%,.4f", memoryValue));
    }

    /**
     * Updates the calculator display like normal.
     * This method is overridden in case we want to add memory display later,
     * but for now it just calls the original display from the Calculator class.
     */
    @Override
    public void updateDisplay() {
        super.updateDisplay();
        // We're not showing memory here because each memory method already prints it.
    }

    /**
     * Adds a value to the calculator (inherited from Calculator).
     *
     * @param value The number to add.
     */
    @Override
    public void add(Number value) {
        super.add(value);
    }

    /**
     * Subtracts a value from the calculator (inherited from Calculator).
     *
     * @param value The number to subtract.
     */
    @Override
    public void subtract(Number value) {
        super.subtract(value);
    }

    /**
     * Multiplies the current value by a number (inherited from Calculator).
     *
     * @param value The number to multiply with.
     */
    @Override
    public void multiply(Number value) {
        super.multiply(value);
    }

    /**
     * Divides the current value by a number (inherited from Calculator).
     *
     * @param value The number to divide by.
     */
    @Override
    public void divide(Number value) {
        super.divide(value);
    }
}
