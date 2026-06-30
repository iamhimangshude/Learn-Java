package Foundation;

public class MultiplicattionTable {
    static void main() {
        for (int i = 1; i<6;i++){
            for (int j = 1; j<11;j++){
                System.out.printf("%d x %d = %d%n", i, j, i*j);
            }
            System.out.println();
        }
    }
}
