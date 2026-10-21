package OOPs;

abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("WagonR: Driving...");
    }
}

class UpdatedWagonR extends WagonR {

    public void fly() {
        System.out.println("flying...");
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
    }
}