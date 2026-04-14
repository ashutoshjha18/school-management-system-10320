// Base Class
class Person {

    // Common attributes
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    public void showRole() {
        System.out.println("I am a person in the school.");
    }

    // Common method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


// Teacher Class (Inheritance)
class Teacher extends Person {

    private String subject;
    private double salary;

    // Constructor
    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    // Overriding method
    @Override
    public void showRole() {
        System.out.println("I am a Teacher. I teach students.");
    }

    // Additional method
    public void displayTeacherInfo() {
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}


// Student Class (Inheritance)
class Student extends Person {

    private int rollNumber;
    private String course;

    // Constructor
    public Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Overriding method
    @Override
    public void showRole() {
        System.out.println("I am a Student. I study subjects.");
    }

    // Additional method
    public void displayStudentInfo() {
        displayInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}


// Main Class
public class Main {

    public static void main(String[] args) {

        System.out.println("=== School Administration System ===\n");

        // Creating objects
        Person p1 = new Teacher("Mr. Ashutosh", 30, "Mathematics", 50000);
        Person p2 = new Student("Mr. Pankaj", 40, 101, "Computer Science");

        // Polymorphism using array
        Person[] people = { p1, p2 };

        // Dynamic Method Dispatch
        for (Person p : people) {
            p.showRole();   // Runtime polymorphism
            System.out.println();
        }

        // Downcasting to access subclass-specific methods
        System.out.println("=== Detailed Information ===\n");

        if (p1 instanceof Teacher) {
            Teacher t = (Teacher) p1;
            t.displayTeacherInfo();
            System.out.println();
        }

        if (p2 instanceof Student) {
            Student s = (Student) p2;
            s.displayStudentInfo();
        }
    }
}