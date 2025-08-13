package Homework;

/*
 * Student Class * Inheritance from Person Class (name, Address)
 */

public class Student extends Person {

    //Define Attribute
    private int numCourse = 0;
    private final String[] courses = new String[30];
    private final int[] grades = new int[30];

    /*
    * Constructor
    * @param Name, Address Call in Super Class (Person Class)
    */
    public Student(String name, String address) {
        //Set Attribute
        super(name, address);
    }

    public void addCourseGrade(String course, int grade) {
        // Validate
        if (courses.length > 30) {
            throw new IllegalArgumentException("Course must be max only 30 courses !!");
        }

        // Add Courses
        courses[numCourse] = course;
        grades[numCourse] = grade;
        numCourse++;
    }

    public void printGrades() {
        // Validate
        if (courses.length == 0) {
            throw new IllegalArgumentException("No Course that been enroll !!");
        }

        //Header
        System.out.println("===================================");
        System.out.println("\t\t\t Summary");
        System.out.println("===================================");

        // Display Grades
        for (int i = 0; i < numCourse; i++) {
            System.out.println((i+1) + ". " + courses[i] + " " + grades[i]);
        }
    }

    public double getAverageGrade() {
        // Validate
        if (courses.length == 0) {
            throw new IllegalArgumentException("No Course that been enroll !!");
        }

        //Average
        double sum = 0;
        for (int i = 0; i < numCourse; i++) {
            sum += grades[i];
        }

        //Return Value
        return sum / numCourse;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

}
