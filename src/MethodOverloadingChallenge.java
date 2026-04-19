public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        //
        // Create two methods with same name: convertToCentimeters
        // The first method has one param of type int, which represents the entire height in
        // inches. You have to convert inches to centimeters, in this method, and pass back the
        // number of centimeters as a double.
        // The second method has two params of type int, one to reprsnt height in feet and one to reprsnt the
        // remaining height in inches. So if a person is 5 foot, 8 inches, the
        // values 5 for feet and 8 for inches would be passed to this method. This method will
        // convert feet and inches to just inches, then call the first method, to get the number of
        // centimeters, also returning the value as a double.
        System.out.println(convertToCentimeters(100));
        System.out.println(convertToCentimeters(5, 10));
    }

    public static double convertToCentimeters(int inches){
        return (double) inches * 2.554;
    }

    public static double convertToCentimeters(int lenFeet, int lenInches){
        int totalHeight;
        totalHeight = (lenFeet * 12) + lenInches;
        return convertToCentimeters(totalHeight);
    }
}
