package Homework;

/*
 * Teacher Class * Inheritance from Person Class (name, Address)
 */

import java.util.ArrayList;

public class Teacher extends Person {

    private int numCourse = 0;
    private final ArrayList<String> courses = new ArrayList<>();

    public Teacher(String name, String address) {
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
            return false;
        }
        // Course already exists
        if (courses.contains(course)) {
            return false;
        }

        // Add Course
        courses.add(course);
        numCourse++;
        return true;
    }

    public boolean removeCourse(String course) {
        //Return remove Value
        return courses.remove(course); // returns false if not found
    }
}
