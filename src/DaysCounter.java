import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DaysCounter {
    public static void main(){
        System.out.println("Countdown Timer Program in Java");
        try {
            final LocalDate targetDate = LocalDate.parse("2027-02-14");
            final LocalDate nowDate = LocalDate.now();
            long daysLeft = ChronoUnit.DAYS.between(nowDate, targetDate);
            System.out.println("days left till war: " + daysLeft);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format set. Please try again");
        } catch(Exception e){
            System.out.println("Something else went wrong" + ": "+ e.getMessage());
        }

    }
}
