package object;
import java.util.Scanner;


class Student {
    String name;
    int year;
    int roll;

    Student(String name, int year, int roll) {
        this.name = name;
        this.year = year;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Roll No: " + roll);
    }
}

public class STUDENTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int num = input.nextInt();
        input.nextLine(); // consume newline after nextInt

        // Create an array of Student objects
        Student[] students = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println("**************************");
            System.out.println("Enter the name of student:");
            String name = input.nextLine();

            System.out.println("Enter the year of student:");
            int year = input.nextInt();

            System.out.println("Enter the Roll No of student:");
            int roll = input.nextInt();
            input.nextLine(); // consume newline after nextInt

           
            students[i] = new Student(name, year, roll);
            System.out.println("**************************");
        }

     
        System.out.println("\n--- Student Details ---");
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        input.close();
    }
}

