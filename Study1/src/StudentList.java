import java.util.ArrayList;

public class StudentList {
    //Set Attribute
    private String name;
    private String address;

    //ArrayList
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    /*
    * Constructor
    * Validate for Input Data
    */

    public StudentList(String name , String address){
        //Validate of input Name
        if (name == null && name.isBlank()) {
            throw new IllegalArgumentException("Name must be assigned !! ");
        }

        //Validate of input Address
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must be assigned !! ");
        }

        this.name = name;
        this.address =address;

        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        //Validate of input Address
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must be assigned !! ");
        }

        this.address = address;
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s)", name, address);
    }

    /*
     * Add a New Course and Grade;
     * @param Courser the course name;
     * @param grade the grade (0-100);
     */

     public void addCourseGrade(String course , int grade){
        //Add Validator for the course and Grade
        if(course.isBlank() || course == null){
            System.out.println("Course must be assigned !! ");
            return; //End Program
        }

        if(grade < 0 || grade > 100){
            System.out.println("Grade must between 0 - 100 !! ");
            return; //End Program
        }        

        //Check if the course limit is reach
        if (courses.size() > 30) {
            System.out.println("Cannot add more than 30 course");
            return; //End Program
        }

        this.courses.add(course);
        this.grades.add(grade);
     }

     //Print all courses and Grade in String format
     public void printGrades(){
        System.out.print(this.name + " ");
        for(int i = 0 ; i < courses.size() ; i++){
            //Display
            System.out.print(this.courses.get(i) + " : " + this.grades.get(i));

            //Commas
            if (i != (courses.size() - 1)) System.out.print(", ");
        }
        //New Lines
        System.out.println();
    }

    //The Average Grade for All Course Return The Average Grade or 0.0 if no courses that have Addded.
    public double getAverageGrade(){
        if(courses.isEmpty()) return 0.0;
        int sum = 0;
        for (int _grade : grades) {
            sum += _grade;
        }
        return (double)sum/courses.size();
    }

}
