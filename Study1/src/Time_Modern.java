import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Modern {
    //Use Local Time
    private LocalTime time;

    public Time_Modern(){
        this.time = LocalTime.of(0, 0, 0);
    }

    public Time_Modern(int hour ,int minute ,int second){
        this.time =  LocalTime.of(hour, minute, second);
    }

    public int getHour(){
        return time.getHour();
    }

    public int getMinute(){
        return time.getMinute();
    }

    public int getSecond(){
        return time.getSecond();
    }

    public Time_Modern withTime(int hour , int minute , int second){
        return new Time_Modern(hour,minute,second);
    }

    public Time_Modern nextSecond(){
        //Call Plus Second
        LocalTime newTime = this.time.plusSeconds(1);
        return new Time_Modern(newTime.getHour() , newTime.getMinute() , newTime.getSecond());
    }

    @Override
    public String toString() {
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
