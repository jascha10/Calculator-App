/**
 * The BasicMath interface defines basic arithmetic operations that can be implemented
 * by classes to perform addition, subtraction, multiplication, and division on numeric values.
 * The operations support different types of numbers using Java generics.
 */
public interface BasicMath {

    /**
     * Adds a given numeric value to the current value.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to add to the current value.
     */
    <N extends Number> void add(N value);

    /**
     * Program:     Calculator
     * @author Jacob Schamp && Rania Hassani
     * @link <https://github.com/jascha10/Calculator-App.git> <github>
     */
    /**
     * Subtracts a given numeric value from the current value.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to subtract from the current value.
     */
    <N extends Number> void subtract(N value);

    /**
     * Multiplies the current value by a given numeric value.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to multiply with the current value.
     */
    <N extends Number> void multiply(N value);

    /**
     * Divides the current value by a given numeric value.
     *
     * @param <N>   A type that extends Number (e.g., Integer, Double).
     * @param value The number to divide the current value by.
     */
    <N extends Number> void divide(N value);
}











































Java Final Coding Concepts Cheat Sheet
 1. UML Diagram to Code
public class Animal {
    // private field
    private String name;
    // getter method (returns name)
    public String getName() {
        return name;
    }
    // setter method (sets name)
    public void setName(String name) {
        this.name = name;
    }
}
// UML shows class structure. You turn it into code with fields, getters, setters, etc.
 2. Base and Derived Classes (with super)
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("Animal speaks");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name); // calls parent constructor
    }
    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }
}
// Use super to call parent class constructor or methods.
 3. Static and Instance Fields
class Student {
    public static int totalStudents = 0; // shared among all objects
    private String name; // unique to each object
    public Student(String name) {
        this.name = name;
        totalStudents++; // update shared count
    }
    public String getName() {
        return name;
    }
}
// Static = one copy for all objects. Instance = unique for each object.
 4. Access Modifiers
public class Test {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    public void show() {
        System.out.println("Accessing all inside class:");
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
    }
}
// public: anywhere, private: only in this class, protected: subclasses or same package.
 5. Default and Overloaded Constructors
class Car {
    String model;
    int year;
    // Default constructor
    public Car() {
        model = "Unknown";
        year = 2000;
    }
    // Overloaded constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
// Overloading = multiple constructors with different parameters.
 6. Setters and Getters
class Person {
    private String name;
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Getter
    public String getName() {
        return name;
    }
}
// Use getters/setters to protect private fields (encapsulation).
 7. ArrayList
 import java.util.ArrayList;
public class Example {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rania");
        names.add("Laila");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
// ArrayList = resizable array that stores objects.
 8. LocalDate
 import java.time.LocalDate;
public class Dates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 5, 7);
        System.out.println("Today: " + today);
        System.out.println("Birthday: " + birthday);
    }
}
// LocalDate stores dates without time. Useful for birthdays, deadlines, etc.
 9. File I/O
 import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello, file!");
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line = reader.readLine();
            System.out.println("Read from file: " + line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// BufferedWriter to write, BufferedReader to read files.
 10. Abstraction: Interface and Generic
interface Animal {
    void speak(); // abstract method (no body)
}
class Cat implements Animal {
    public void speak() {
        System.out.println("Meow");
    }
}
class Box<T> {
    private T item;
    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
}
// Interface = contract that classes must follow. Generics = allow any type (T, E,
etc.).

