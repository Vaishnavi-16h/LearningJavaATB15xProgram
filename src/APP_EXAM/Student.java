package APP_EXAM;
//Implement a class "Student" with attributes "name", "rollNo", and "section".
// Add a method to print student details.
public class Student
{
    // Attributes
    private String name;
    private int rollNo;
    private String section;

    // Constructor
    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Section      : " + section);
    }

    // Main method
    public static void main(String[] args)
    {
        Student s1 = new Student("Bob", 101, "A");
        s1.printDetails();
    }
}

