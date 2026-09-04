package CalendarDates;

import java.util.Map;

public class DateCalc {

    private final Map<Integer, String> dayOfWeekMapping = Map.of(
            0, "Saturday",
            1, "Sunday",
            2, "Monday",
            3, "Tuesday",
            4, "Wednesday",
            5, "Thursday",
            6, "Friday");

    public String findDayOfWeek(int year, int month, int date) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int shortYear = year % 100;
        int centuryYear = (int) year / 100;

        int formulatedValue = (date + ((int) (13 * (month + 1)) / 5) + shortYear + (int) (shortYear / 4)
                + (int) (centuryYear / 4) - 2 * centuryYear) % 7;
        String dayOfWeek = dayOfWeekMapping.get(formulatedValue);

        return dayOfWeek;
    }
}
