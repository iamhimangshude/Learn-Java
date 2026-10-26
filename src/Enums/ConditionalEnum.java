package Enums;


public class ConditionalEnum {
    public static void main(String[] args) {
        Status s = Status.Success;

        switch (s) {
            case Running -> System.out.println("All good");
            case Pending -> System.out.println("On the way");
            case Failed -> System.out.println("Try again");
            default -> System.out.println("Done");
        }

        // if (s == Status.Running)
        //     System.out.println("All good");
        // else if (s == Status.Pending)
        //     System.out.println("on the way");
        // else if (s == Status.Failed)
        //     System.out.println("Try again");
        // else
        //     System.out.println("Done");
    }
}
