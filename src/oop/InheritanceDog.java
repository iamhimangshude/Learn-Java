package oop;

public class InheritanceDog extends InheritanceAnimal {
    private String earShape;
    private String tailShape;

    public InheritanceDog() {
        // super();
        super("Mutt", "big", 50);
    }

    public InheritanceDog(String type, double weight) {
        this(type, weight, "Perky", "Curled");// using constructor chaining
    }

    public InheritanceDog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "InheritanceDog {earShape=" + earShape + ", tailShape=" + tailShape + "} " + super.toString();
    }

    public void makeNoise() {

        if (type == "Wolf") {
            System.out.println("Ow Woooo!");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    private void bark() {
        System.out.print("Woof! ");
    }

    private void run() {
        System.out.print("Dog Running ");
    }

    private void walk() {
        System.out.print("Dog Walking ");
    }

    private void wagTail() {
        System.out.print("Tail Wagging ");
    }
}
