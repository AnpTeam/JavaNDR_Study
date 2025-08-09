public class Student {
    //Setting Attribute
    private String name;
    private String address;
    private int numCourse = 0;
    //Array Variable
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    //Methods
    //Constructor
    public Student(String name , String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + "("+ getAddress() +")";
    }

    public void addCourseGrade(String course , int grade){
        if(numCourse < 30){
            courses[numCourse] = course;
            grades[numCourse] = grade ;
            numCourse++;
        }
        else{
            System.out.println("Cannot add more than 30 courses.");
        }
    }

    public void printGrades(){
        System.out.print(this.name + " ");
        for(int i = 0 ; i < numCourse ; i++){
            //Display
            System.out.print(this.courses[i] + " : " + this.grades[i]);

            //Commas
            if (i != (numCourse - 1)) System.out.print(", ");
        }
        //New Lines
        System.out.println();
    }

    public double getAverageGrade(){
        if(numCourse == 0) return 0.0;
        int sum = 0;
        for(int i = 0 ; i < numCourse ; i++){
            sum += grades[i];
        }

        return (double)sum/numCourse;
    }
}
