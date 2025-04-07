package AdvanceCalc;

public class updateDisplay {
    @Override
    public void sqrt() {
        operator = '\u221A';
        previousValue = currentValue;
        inputValue = 0.0;
        currentValue = Math.sqrt(this.currentValue);
        updateDisplay();
    }
    @Override
    public void updateDisplay() {
        String format1 = " %,12." + precision + "f%n";
        String format2 = "%1s%,12." + precision + "f%n";

        if (operator == '\u221A') {
            System.out.printf(format2, operator, previousValue);

        } else {
            System.out.printf(format1, previousValue);
            System.out.printf(format2, operator, inputValue);
        }

        System.out.println("==============");
        System.out.printf(format1, currentValue);
        System.out.println();
    }
}
