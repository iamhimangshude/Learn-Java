public class Switch {
    public static void main(String args[]) {
        int n = 8;
        // We could use if-else_if-else method, but choose to use the smarter one
        // We'll use switch-case statement
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Week Day");
                break;
        }

        // Switch Case syntax in updated java versions (after v5)

        String day = "Sunday";
        // switch-case updated version (Syntax sugar)
        switch (day) {
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

        String result = switch (day) {
            case "Saturday", "Sunday" -> "6am"; // or use, case <> : yield expression
            case "Monday" -> "8am";
            default -> "7am";
        };
        // Using the switch-case as expression
        System.out.println("Switch-case as expr");
        System.out.println(result);
    }
}
