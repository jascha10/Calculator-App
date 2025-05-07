/**
 * Program:     Calculator
 * @author Jacob Schamp && Rania Hassani
 * @link <https://github.com/jascha10/Calculator-App.git> <github>
 */
/**
 * The AdvanceMath interface defines advanced mathematical operations
 * that can be implemented by classes needing to perform operations like
 * square root calculation and precision setting.
 */
public interface AdvanceMath {

    /**
     * Calculates the square root of a given value.
     *
     * @param value The number to calculate the square root of.
     * @return The square root of the value.
     */
    double sqrt(double value);

    /**
     * Sets the precision for displaying results.
     *
     * @param precision The number of decimal places to use when displaying results.
     *                  The value must be between 0 and 10.
     */
    void setPrecision(int precision);



}





import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        // 1. Create an ArrayList to store student names (Strings)
        ArrayList<String> students = new ArrayList<>();

        // 2. Add elements to the ArrayList
        students.add("Rania");
        students.add("Laila");
        students.add("Fatima");

        // 3. Print all elements using a loop
        System.out.println("All students:");
        for (String name : students) {
            System.out.println(name);
        }

        // 4. Get the size of the ArrayList
        System.out.println("Total students: " + students.size());

        // 5. Get a specific element by index (first student)
        System.out.println("First student: " + students.get(0));

        // 6. Check if a student is in the list
        if (students.contains("Fatima")) {
            System.out.println("Fatima is in the list.");
        }

        // 7. Remove an element by name
        students.remove("Laila");

        // 8. Print the list after removing one student
        System.out.println("After removal:");
        for (String name : students) {
            System.out.println(name);
        }

        // 9. Check if the list is empty
        System.out.println("Is the list empty? " + students.isEmpty());

        // 10. Clear all elements
        students.clear();

        // 11. Print the size after clearing
        System.out.println("List size after clearing: " + students.size());
    }
}add(item);          // Adds an item to the end of the list
get(index);         // Returns the item at the specified index
remove(item);       // Removes the first occurrence of the item
size();             // Returns the number of elements
contains(item);     // Returns true if the list contains the item
isEmpty();          // Returns true if the list is empty
clear();            // Removes all elements from the list