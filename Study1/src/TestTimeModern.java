public class TestTimeModern {
    public static void main(String[] args) {
// Test constructor and toString()
        Time_Modern t = new Time_Modern(23, 59, 59);
        System.out.println("Starting time : " + t); // 23:59:59

        // Test nextSecond()
        Time_Modern t2 = t.nextSecond();
        System.out.println("After adding 1 second : " + t2); // 00:00:00

        //Test Chaining
        Time_Modern t3 = t2.nextSecond().nextSecond();
        System.out.println("After 2 more second : " + t3);

        //Getters
        System.out.println("Hour : " + t3.getHour());
        System.out.println("Minute : " + t3.getMinute());
        System.out.println("Second : " + t3.getSecond());

        //Create New Time 
        Time_Modern t4 = t3.withTime(7, 30 , 15);
        System.out.println("New time with withTime() : " + t4);
    }
    }
