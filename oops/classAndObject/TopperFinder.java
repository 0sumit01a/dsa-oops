package oops.classAndObject;

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

}

public class TopperFinder {

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1, 85.5);
        Student s2 = new Student("Bob", 2, 92.0);
        Student s3 = new Student("Charlie", 3, 88.5);

        Student[] students = { s1, s2, s3 };

        Student topper = findTopper(students);
        System.out.println("Topper Details:");
        topper.displayInfo();
    }

    public static Student findTopper(Student[] students) {
        Student topper = students[0];

        for (Student student : students) {
            if (student.marks > topper.marks) {
                topper = student;
            }
        }

        return topper;
    }

}
