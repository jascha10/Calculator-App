public class Calculator {
    double previousValue = 0.0;
    double inputValue = 0.0;
    double currentValue = 0.0;
    char operator = '+';
    public void updateDisplay{
        System.out.println();
        System.out.println(" %,12.2d%n", previousValue);
        System.out.println("%1s%,12.2d%n", operator, inputvalue);
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
}
