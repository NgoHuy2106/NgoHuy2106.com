
package baitap;

import java.util.ArrayList;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', gpa=" + gpa + "}";
    }
}
class StudentList {
    private ArrayList<Student> students;
    public StudentList() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void updateStudentById(String id, String newName, double newGpa) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(newName);
                student.setGpa(newGpa);
                break;
            }
        }
    }
    public void deleteStudentById(String id) {
        students.removeIf(student -> student.getId().equals(id));
    }
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public Student findStudentWithHighestGpa() {
        if (students.isEmpty()) {
            return null;
        }
        Student highestGpaStudent = students.get(0);
        for (Student student : students) {
            if (student.getGpa() > highestGpaStudent.getGpa()) {
                highestGpaStudent = student;
            }
        }
        return highestGpaStudent;
    }
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudent(new Student("1", "Alice", 3.9));
        studentList.addStudent(new Student("2", "Bob", 3.7));
        studentList.addStudent(new Student("3", "Charlie", 3.8));
        System.out.println("All students:");
        studentList.displayAllStudents();
        System.out.println("\nUpdating student with ID 2:");
        studentList.updateStudentById("2", "Bobby", 3.85);
        studentList.displayAllStudents();
        System.out.println("\nDeleting student with ID 1:");
        studentList.deleteStudentById("1");
        studentList.displayAllStudents();
        System.out.println("\nStudent with highest GPA:");
        System.out.println(studentList.findStudentWithHighestGpa());
    }
}

