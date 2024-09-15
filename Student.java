
package baitap;

public class Student {
        private float GPA;
    private String major;
    public Student(float GPA, String major) {
        this.GPA = GPA;
        this.major = major;
    }
    public void addStudent(float GPA, String major) {
        this.GPA = GPA;
        this.major = major;
    }
    public void displayInfo() {
        System.out.println("GPA: " + GPA);
        System.out.println("Major: " + major);
    }
    public float getGPA() {
        return GPA;
    }
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public static void main(String[] args) {
        Student student = new Student(3.5f, "Computer Science");
        student.displayInfo();
        student.addStudent(3.8f, "Data Science");
        student.displayInfo();
    }
}