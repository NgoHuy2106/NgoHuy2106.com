
package baitap;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double GPA;
    public Student(int id, String name, double GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + GPA;
    }
}
class Processor {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        students.add(new Student(id, name, gpa));
        System.out.println("Student added successfully.");
    }
    public void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        for (Student student : students) {
            if (student.id == id) {
                System.out.print("Enter new name: ");
                student.name = scanner.nextLine();
                System.out.print("Enter new GPA: ");
                student.GPA = scanner.nextDouble();
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        students.removeIf(student -> student.id == id);
        System.out.println("Student deleted successfully.");
    }
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    public void findHighestGPA() {
        if (students.isEmpty()) {
            System.out.println("No students to evaluate.");
            return;
        }
        Student highestGPAStudent = students.get(0);
        for (Student student : students) {
            if (student.GPA > highestGPAStudent.GPA) {
                highestGPAStudent = student;
            }
        }
        System.out.println("Student with the highest GPA: " + highestGPAStudent);
    }
    public void run() {
        while (true) {
            System.out.println("\nOptions:");
            System.out.println("a. Add a new student");
            System.out.println("b. Update a student by id");
            System.out.println("c. Delete a student by id");
            System.out.println("d. Display all students");
            System.out.println("e. Find the student with the highest GPA");
            System.out.println("f. Exit");
            System.out.print("Choose an option: ");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'a':
                    addStudent();
                    break;
                case 'b':
                    updateStudent();
                    break;
                case 'c':
                    deleteStudent();
                    break;
                case 'd':
                    displayAllStudents();
                    break;
                case 'e':
                    findHighestGPA();
                    break;
                case 'f':
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.run();
    }
}