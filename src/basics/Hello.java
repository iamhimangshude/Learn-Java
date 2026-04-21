package basics;
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Himangshu");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) || (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        System.out.println(isCar);
        System.out.println("Entering the if block");
        // if (isCar = true) {
        // System.out.println(isCar);
        // System.out.println("This is not supposed to happen");
        // }

        // if (isCar == true){ // an improved way of writing the same logic!
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        // Ternary operator; ====================================
        // It is also known as conditional operator.
        // Syntax: operand1 ? operand2 : operand3

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is not domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        // Challenge Question based on Operator::
        // Step 1 = Create a double variable with a value of 20.00
        // Step 2 = Create a second variable of type double with a value 80.00
        // Step 3 = add both numbers together, then multiply by 100.00
        // Step 4 = use the remainder operator, to figure out what the
        // remainder from the result of the operation in step 3, and 40.00, will be.
        // step 5 = create a boolean variable that assigns the value true, if the
        // remainder in step 4 is 0.00, or false if it's not zero.
        // step 6 = output the boolean variable just to see what the result is
        // step 7 = write an if statement that displays a message, 'got some remainder',
        // if the boolean in step 5 is not true

        double myDoubleVar = 20.00d;
        double myAnotherDoubleVar = 80.00d;

        double result = (myDoubleVar + myAnotherDoubleVar) * 100.00d;
        double modulusResult = result % 40.00d;

        System.out.println(modulusResult);

        boolean boolResult = (modulusResult == 0.00d);
        System.out.println(boolResult);

        if (!boolResult) {
            System.out.println("got some remainder");
        }

    }
}
