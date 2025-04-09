s public class Calculator {
    double previousValue = 0.0;
    double inputValue = 0.0;
    double currentValue = 0.0;
    char operator = '+';
    public void updateDisplay () {
        System.out.println();
        System.out.println(" %,12.2d%n", previousValue);
        System.out.println("%1s%,12.2d%n", operator, inputValue);
        System.out.println("==============");
        System.out.println(" %,12.2d%n", currentValue);
        System.out.println();
    }

    @Override
    public <N extends Number> void add(N value) {
        operator ='+';
        previousValue = currentValue;
        this.inputValue = value.doubleValue();
        currentValue += inputValue;
        updateDisplay();
    }
     public void clear() {
        previousValue = 0.0;
        inputValue = 0.0;
        currentValue = 0.0;
        System.out.println("Calculator Cleared");
        updateDisplay();
    }
    public <N extends Number> void subtract(N value) {
    operator = '-';
    previousValue = currentValue;
    inputValue = value.doubleValue();
    currentValue -= inputValue;
    updateDisplay();
}
    public <N extends Number> void multiply(N value) {
    operator = '*';
    previousValue = currentValue;
    inputValue = value.doubleValue();
    currentValue *= inputValue;
    updateDisplay();
}
  public class Testbench {
    public static void main(String[] args) {
        System.out.println("Calculator On");

        Calculator calc = new Calculator();
        calc.clear();             // Output: 0.00
        calc.add(10.22);          // 10.22
        calc.subtract(2.22);      // 8.00
        calc.multiply(10.00);     // 80.00
    }
}
}
