package OOPs;

class Computer {

    // Methods Demo
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";

        return "Nothing";
    }

}

public class MethodsDemo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);
    }
}
