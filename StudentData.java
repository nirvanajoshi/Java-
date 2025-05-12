import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int studentCount;

        System.out.print("How many students? ");
        studentCount = Integer.parseInt(scanner.nextLine());

        Student[] students = new Student[studentCount];

        // Get input for each student
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll Number: ");
            String roll = scanner.nextLine();

            System.out.print("Marks: ");
            String marks = scanner.nextLine();

            students[i] = new Student(name, roll, marks);
        }

        String filepath = "students.txt";

        // Write all student data to file
        try (FileWriter writer = new FileWriter(filepath)) {
            for (Student student : students) {
                writer.write(student.toString());
                writer.write("-----------\n"); // Separator
            }
            System.out.println("\nAll student data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        // Read and display the data from file
        System.out.println("\nReading student data from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }

        scanner.close();
    }
}
class Student {
    String name;
    String roll;
    String marks;

    // Constructor
    Student(String name, String roll, String marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Convert student data to string format
    public String toString() {
        return "Name: " + name + "\nRoll No: " + roll + "\nMarks: " + marks + "\n";
    }
}