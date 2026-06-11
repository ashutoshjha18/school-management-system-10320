//Name:Ashutosh Jha,erp-10320;
class Person {

    
    protected String name;
    protected int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void showRole() {
        System.out.println("I am a person in the school.");
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



class Teacher extends Person {

    private String subject;
    private double salary;

    
    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    
    @Override
    public void showRole() {
        System.out.println("I am a Teacher. I teach Many students.");
    }

    
    public void displayTeacherInfo() {
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {

    private int rollNumber;
    private String course;

    
    public Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    
    @Override
    public void showRole() {
        System.out.println("I am a Student. I study subjects.");
    }

    
    public void displayStudentInfo() {
        displayInfo();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}



public class Main {

    public static void main(String[] args) {

        System.out.println("=== School Administration System ===\n");

    
        Person p1 = new Teacher("Mr. Ashutosh", 30, "Mathematics", 50000);
        Person p2 = new Student("Mr. Pankaj", 40, 101, "Computer Science");

    
        Person[] people = { p1, p2 };

        
        for (Person p : people) {
            p.showRole();   
            System.out.println();
        }

        
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