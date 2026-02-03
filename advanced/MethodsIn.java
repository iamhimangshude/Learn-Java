class Computer {
    public void playMusic() {
        System.out.println("Muuuusssiiicc!");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        }
        return "Nothing";
    }
}

// method overloading
class Calculator {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class MethodsIn {
    public static void main(String a[]) {
        // Computer comp = new Computer();
        // comp.playMusic();
        // String str = comp.getMeAPen(10);
        // System.out.println(str);

        Calculator obj = new Calculator();
        double r1 = obj.add(1.2, 2);
        System.out.println(r1);
    }
}
