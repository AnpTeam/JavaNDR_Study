import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* Immutable Date Class that wraps java.time.LocalDate
 * 
 */
public class Date_Modern {

    private LocalDate date;

    public Date_Modern(int year , int month , int day){
        try {
            this.date = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Invalid Date : " + e.getMessage());
        }
    }

    public int getYear(){
        return date.getYear();
    }

    public int getMonth(){
        return date.getMonthValue();
    }

    public int getDay(){
        return date.getDayOfMonth();
    }

    @Override
    public String toString(){
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    public Date_Modern withDate(int year , int month , int day){
        return new Date_Modern(year, month, day);
    }
}
