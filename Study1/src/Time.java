public class Time {
    //Config Attribute
    private int second;
    private int minute;
    private int hour;

    public Time(){
        second = 0;
        minute = 0 ;
        hour = 0;
    }

    public Time(int hour , int minute , int second ){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour){
        if (hour < 0 || hour >=24) {
            throw new IllegalArgumentException("Hour must between 0 and 23");
        }
        //Default
        this.hour = hour;
    }

    public void setMinute(int minute){
        if (minute < 0 || minute >=60) {
            throw new IllegalArgumentException("Minute must between 0 and 60");
        }
        //Default
        this.minute = minute;
    }

    public void setSecond(int second){
        if (second < 0 || second >=60) {
            throw new IllegalArgumentException("Second must between 0 and 60");
        }
        //Default
        this.second = second;
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d" , hour,minute,second);
    }

    public void setTime(int hour , int minute , int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time nextSecond(){
        this.second++;

        //Check Second
        if (this.second == 60) {
            this.minute++;
            this.second=0;
        }

        //Check Minute
        if (this.minute == 60) {
            this.hour++;
            this.minute = 0;
        }

        //Check Hour
        if (hour == 24) {
            this.hour = 0 ;
        }

        //Return
        return this;
    }
}
