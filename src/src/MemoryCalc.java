public class MemoryCalc extends Calculator {
    double memoryValue = 0.0;

    public void memoryAdd() {
        memoryValue += currentValue;
        System.out.println("Memory Add: " + String.format("%12.4f", memoryValue));
    }

    public void memorySubtract() {
        memoryValue -= currentValue;
        System.out.println("Memory Subtract: " + String.format("%12.4f", memoryValue));
    }

  
