/**
 * Program:     Calculator
 * @author Jacob Schamp && Rania Hassani
 * @link <https://github.com/jascha10/Calculator-App.git> <github>
 */
/**
 * The Testbench class is used to simulate different operations of the Calculator.
 * It demonstrates the use of basic operations like addition, subtraction, multiplication,
 * division, memory functions, and advanced features like square root and exponentiation.
 */
public class Testbench {
    public static void main(String[] args) {
        System.out.println("Calculator On");

        // Creating an instance of AdvanceCalc, which extends Calculator.
        AdvanceCalc calc = new AdvanceCalc();

        // Set initial precision to 2 decimal places.
        calc.setPrecision(2);

        // Clear the calculator, resetting all values.
        calc.clear();

        // Perform addition: 10.22
        calc.add(10.22);

        // Perform subtraction: subtract 2.22
        calc.subtract(2.22);

        // Add the current value to memory.
        calc.memoryAdd();

        // Perform multiplication: multiply by 10
        calc.multiply(10.00);

        // Subtract the current value from memory.
        calc.memorySubtract();

        // Perform division: divide by 2
        calc.divide(2.00);

        // Change the precision to 4 decimal places.
        calc.setPrecision(4);

        // Simulate exponentiation (raise current value to the power of 2.0).
        calc.operator = '^'; // Manually set the operator for power.
        calc.inputValue = 2.0;
        calc.previousValue = calc.currentValue;
        calc.currentValue = Math.pow(calc.previousValue, calc.inputValue);
        calc.updateDisplay();

        // Now, calculate the square root of the current value.
        calc.sqrt(calc.currentValue);

        // Use memory value in a new operation.
        System.out.println("Using memory value");
        calc.previousValue = calc.currentValue;
        calc.inputValue = -72.0;  // Add -72.0 to the current value.
        calc.operator = '+';      // Set operator to addition.
        calc.currentValue = calc.previousValue + calc.inputValue;
        calc.updateDisplay();

        // Clear the memory after use.
        calc.clearMemory();
        System.out.println("Memory Cleared");

        // Finally, clear the entire calculator.
        calc.clear();
    }
}
