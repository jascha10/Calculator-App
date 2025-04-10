/**
 * Program:     Calculator
 * @author Jacob Schamp && Rania Hassani
 * @link <https://github.com/jascha10/Calculator-App.git> <github>
 */
/**
 * The Calculator class is an abstract base class that implements the BasicMath interface.
 * It provides basic calculator operations such as addition, subtraction,
 * multiplication, and division. It also manages display formatting and stores
 * calculation history like previous, current, and input values.
 * This class is designed to be extended by more advanced calculator classes.
 */
public abstract class Calculator implements BasicMath {

    /**
     * Stores the previous result before the current operation.
     */
    double previousValue = 0.0;

    /**
     * The value currently being input for an operation.
     */
    double inputValue = 0.0;

    /**
     * The current result of the last operation.
     */
    double currentValue = 0.0;

    /**
     * The operator used in the last operation ('+', '-', '*', or '/').
     */
    char operator = '+';

    /**
     * Number of decimal places to display for numbers.
     * Can be shared across all classes that extend Calculator.
     */
    int precision = 2;

    /**
     * Displays the current state of the calculator using the set precision.
     * It shows the previous value, the operator with the input value,
     * and the current result.
     */
    public void updateDisplay() {
        String format1 = "%,." + precision + "f%n";
        String format2 = "%1s%,." + precision + "f%n";

        System.out.printf(format1, previousValue);
        System.out.printf(format2, operator, inputValue);
        System.out.println("==============");
        System.out.printf(format1, currentValue);
        System.out.println();
    }

    /**
     * Resets all calculator values to zero and updates the display.
     */
    public void clear() {
        previousValue = 0.0;
        inputValue = 0.0;
        currentValue = 0.0;
        System.out.println("Calculator Cleared");
        updateDisplay();
    }

    /**
     * Adds a numeric value to the current result.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to add to the current value.
     */
    @Override
    public <N extends Number> void add(N value) {
        operator = '+';
        inputValue = value.doubleValue();
        previousValue = currentValue;
        currentValue = previousValue + inputValue;
        updateDisplay();
    }

    /**
     * Subtracts a numeric value from the current result.
     *
     * @param <N>   A type that extends Number.
     * @param value The number to subtract from the current value.
     */
    @Override
    public <N extends Number> void subtract(N value) {
        operator = '-';
        inputValue = value.doubleValue();
        previousValue = currentValue;
        currentValue = previousValue - inputValue;
        updateDisplay();
    }

    /**
     * Multiplies the current result by a numeric value.
     *
     * @param <N>   A type that extends Number.
     * @param value The number to multiply the current value by.
     */
    @Override
    public <N extends Number> void multiply(N value) {
        operator = '*';
        inputValue = value.doubleValue();
        previousValue = currentValue;
        currentValue = previousValue * inputValue;
        updateDisplay();
    }

    /**
     * Divides the current result by a numeric value.
     * Note: This method does not handle division by zero.
     *
     * @param <N>   A type that extends Number.
     * @param value The number to divide the current value by.
     */
    @Override
    public <N extends Number> void divide(N value) {
        operator = '/';
        inputValue = value.doubleValue();
        previousValue = currentValue;
        currentValue = previousValue / inputValue;
        updateDisplay();
    }
}
