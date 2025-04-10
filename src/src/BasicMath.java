/**
 * The BasicMath interface defines basic arithmetic operations that can be implemented
 * by classes to perform addition, subtraction, multiplication, and division on numeric values.
 * The operations support different types of numbers using Java generics.
 */
public interface BasicMath {

    /**
     * Adds a given numeric value to the current value.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to add to the current value.
     */
    <N extends Number> void add(N value);

    /**
     * Program:     Calculator
     * @author Jacob Schamp && Rania Hassani
     * @link <https://github.com/jascha10/Calculator-App.git> <github>
     */
    /**
     * Subtracts a given numeric value from the current value.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to subtract from the current value.
     */
    <N extends Number> void subtract(N value);

    /**
     * Multiplies the current value by a given numeric value.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to multiply with the current value.
     */
    <N extends Number> void multiply(N value);

    /**
     * Divides the current value by a given numeric value.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to divide the current value by.
     */
    <N extends Number> void divide(N value);
}
