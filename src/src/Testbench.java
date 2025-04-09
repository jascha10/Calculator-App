public class Testbench {
    public static void main(String[] args) {
        System.out.println("Calculator On");

        AdvanceCalc calc = new AdvanceCalc();
        calc.clear();
        calc.add(10.22);          // Test normal add
        calc.setPrecision(4);     // Set precision to 4 decimal places
        calc.multiply(10.00);     // Test multiply with new precision
        calc.sqrt(1600.00);       // Test square root with precision
        calc.memoryAdd();         // Test memory functionality
    }
}
