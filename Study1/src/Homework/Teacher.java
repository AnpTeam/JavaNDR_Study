package Homework;

/*
 * Teacher Class * Inheritance from Person Class (name, Address)
 */

import java.util.ArrayList;

public class Teacher extends Person {
    //Define Attribute
    private int numCourse = 0;
    private final ArrayList<String> courses = new ArrayList<>();

    /*
     * Constructor
     * @param Name, Address Call in Super Class (Person Class)
     */
    public Teacher(String name, String address) {
        //Set Attribute
        super(name, address);
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course) {
        //Validate
        // Course size is max
        if (courses.size() > 5){
            System.out.println("Course is 5 course already, Cannot add !!");
            return false;
        }

        // Course already exists
        if (courses.contains(course)) {
            System.out.println("Course is already Existed");
            return false;
        }

        // Add Course
        courses.add(course);
        System.out.println("[" + course + "] has been added");
        System.out.println("You have " + numCourse + "courses already.");
        numCourse++;
        return true;
    }

    public boolean removeCourse(String course) {
        //Return remove Value
        System.out.println("[" + course + "] has been removed");
        return courses.remove(course); // returns false if not found
    }
}