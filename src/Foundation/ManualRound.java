package Foundation;

public class ManualRound {
    static void main() {
        double preciseMeasurement = 87.68;
        int truncatedValue = (int) preciseMeasurement;
        System.out.println(truncatedValue);

        if ((preciseMeasurement-truncatedValue) > 0.5){
            truncatedValue++;
        }
        System.out.println("Rounded value is " + truncatedValue);
    }
}
