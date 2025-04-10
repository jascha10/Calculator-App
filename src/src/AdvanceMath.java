/**
 * Program:     Calculator
 * @author Jacob Schamp && Rania Hassani
 * @link <https://github.com/jascha10/Calculator-App.git> <github>
 */
/**
 * The AdvanceMath interface defines advanced mathematical operations
 * that can be implemented by classes needing to perform operations like
 * square root calculation and precision setting.
 */
public interface AdvanceMath {

    /**
     * Calculates the square root of a given value.
     *
     * @param value The number to calculate the square root of.
     * @return The square root of the value.
     */
    double sqrt(double value);

    /**
     * Sets the precision for displaying results.
     *
     * @param precision The number of decimal places to use when displaying results.
     *                  The value must be between 0 and 10.
     */
    void setPrecision(int precision);
}
