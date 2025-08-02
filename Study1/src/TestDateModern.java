public class TestDateModern {

    public static void main(String[] args) {
        Date_Modern d1 = new Date_Modern(2025 , 2, 8);

        System.out.println("Original Date : " + d1);

        //Use a chain of with Methods to create modified copy
        Date_Modern d2 = d1.withDate(2025, 3, 8);
        System.out.println("New Date (from chain) : " + d2);
        System.out.println("Year is " + d2.getYear());
        System.out.println("Month is " + d2.getMonth());
        System.out.println("Day is " + d2.getDay());
    }
}