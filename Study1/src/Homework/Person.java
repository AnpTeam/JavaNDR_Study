package Homework;

/*
 *  Person Class *   Inheritance to Student, Teacher Class
 */

class Person {

    //Define Attribute for Class
    private final String name;
    private String address;

    /* 
    * Constructor Class
    * @params name , @param address
     */
    public Person(String name, String address) {
        //Validation
        // Name
        if (name.isBlank()) {
            throw new IllegalArgumentException("Invalid Name !!");
        }
        //Address
        if (address.isBlank()) {
            throw new IllegalArgumentException("Invalid Address !!");
        }

        //Set Attribute
        this.name = name;
        this.address = address;
    }

    //Setter - Getter Method
    //Name
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    //Address
    public String getAddress() {
        return address;
    }

    //To String Method
    @Override
    public String toString() {
        return this.name + "(" + this.address + ")";
    }
}
