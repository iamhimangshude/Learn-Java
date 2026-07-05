package GenericsExtra.model;

import java.util.Random;

import GenericsExtra.util.QueryItem;

public class Student implements QueryItem{
    private String name;
    private String course;
    private int yearStarted;

    protected Random random = new Random();
    private static String[] firstNames = { "Ann", "Bill", "Cathy", "John", "Tim" };
    private static String[] courses = { "C++", "Python", "Java" };

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2024);
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchField(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch(fName){
            case "NAME"-> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted==Integer.parseInt(value);
            default-> false;
        };
    }

    
}