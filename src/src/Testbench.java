public class Testbench {
    public static void main(String[] args) {
        System.out.println("Calculator On");

        Calculator calc = new Calculator();
        calc.clear();
        calc.add(10.22);
        calc.subtract(2.22);
        calc.multiply(10.00);
        calc.divide(2.00);
    }
}
