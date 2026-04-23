package ControlFlowLogics;

public class Switch {
    public static void main(String[] args) {
        // Traditional Conditionals
        // int value = 1;

        // if (value == 1) {
        // System.out.println("Value was 1");
        // } else if (value == 2) {
        // System.out.println("Value was 2");
        // } else {
        // System.out.println("Was not 1 or 2");
        // }

        // Using switch
        int switchValue = 3;

        // Traditional switch statement
        // switch (switchValue) {
        // case 1:
        // System.out.println("Value was 1");
        // break;

        // case 2:
        // System.out.println("Value was 2");
        // break;

        // case 3:
        // case 4:
        // case 5:
        // System.out.println("Was a 3, a 4, or a 5");
        // System.out.println("Actually it was a " + switchValue);
        // break;

        // case 6:
        // case 7:
        // System.out.println("was a 6 or a 7");
        // System.out.println("Actually it was a " + switchValue);
        // break;

        // default:
        // System.out.println("Was not 1 or 2");
        // break;
        // }

        // Enhanced switch statement
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            case 6, 7 -> {
                System.out.println("was a 6 or a 7");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, 5, 6, or 7");
        }

        // Valid switch value types
        // -> byte, short, int, char
        // -> String or enum
        // Note: Cannot use long, float, double or boolean or their wrappers.

        String month = "ZZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        // Traditional Switch
        // switch (month) {
        // case "JANUARY":
        // case "FEBRUARY":
        // case "MARCH":
        // return "1st";
        // case "APRIL":
        // case "MAY":
        // case "JUNE":
        // return "2nd";
        // case "JULY":
        // case "AUGUST":
        // case "SEPTEMBER":
        // return "3rd";
        // case "OCTOBER":
        // case "NOVEMBER":
        // case "DECEMBER":
        // return "4th";
        // default:
        // return "bad";
        // }

        // Enhanced Switch
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
