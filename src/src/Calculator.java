public abstract class Calculator implements BasicMath {
    double previousValue = 0.0;
    double inputValue = 0.0;
    double currentValue = 0.0;
    char operator = '+';
    public void updateDisplay () {
        System.out.println();
        System.out.printf(" %,12.2d%n", previousValue);
        System.out.printf("%1s%,12.2d%n", operator, inputValue);
        System.out.println("==============");
        System.out.printf(" %,12.2d%n", currentValue);
        System.out.println();
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
    public <N extends Number> void divide(N value) {
    operator = '/';
    previousValue = currentValue;
    inputValue = value.doubleValue();
    
    if (inputValue == 0.0) {
        System.out.println("Error: Division by zero");
        return;
    }

    currentValue /= inputValue;
    updateDisplay();
}

    @Override
    public <N extends Number> void add(N value) {
        operator = '+';
        previousValue = currentValue;
        currentValue = value.doubleValue();
        currentValue += inputValue;
        updateDisplay();
    }

    @Override
    public <N extends Number> void subtract(N value) {
        operator = '-';
        previousValue = currentValue;
        currentValue = value.doubleValue();
        currentValue += inputValue;
        updateDisplay();
    }

    @Override
    public <N extends Number> void multiply(N value) {
        operator = '*';
        previousValue = currentValue;
        currentValue = value.doubleValue();
        currentValue += inputValue;
        updateDisplay();
    }

    @Override
    public <N extends Number> void divide(N value) {
        operator = '/';
        previousValue = currentValue;
        currentValue = value.doubleValue();
        currentValue += inputValue;
        updateDisplay();
    }
}
