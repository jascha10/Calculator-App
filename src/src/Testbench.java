public class Testbench {
    public static void main(String[] args) {
        System.out.println("Calculator On");

        AdvanceCalc calc = new AdvanceCalc();
        calc.clear();               // Clear Calculator
        calc.add(10.22);            // Add
        calc.subtract(2.22);        // Subtract
        calc.multiply(10.00);       // Multiply
        calc.divide(2.00);          // Divide
        calc.memoryAdd();           // Add to memory
        calc.memorySubtract();      // Subtract from memory
        calc.clearMemory();         // Clear memory

        calc.setPrecision(4);       // Set precision to 4 decimal places
        calc.sqrt(1600.00);         // Calculate square root
    }
}
