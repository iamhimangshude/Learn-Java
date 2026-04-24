package ControlFlowLogics;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int start = 5, evenCount = 0, oddCount = 0;
        while (start <= 20) {
            start++;
            if (!isEvenNumber(start)) {
                oddCount++;
                continue;
            }
            System.out.println(start);
            evenCount++;
            if (evenCount == 5)
                break;
        }

        System.out.println("Total Even Numbers: " + evenCount + " and Odd Numbers: " + oddCount);
    }

    public static boolean isEvenNumber(int num) {
        return (num % 2 == 0);
    }
}
