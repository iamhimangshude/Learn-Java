package OOPs;

class Mobile {
    static String name;
    String brand;
    int price;

    static {
        name = "Phone";
        System.out.println("in static blk");
    }

    public Mobile() {
        brand = "";
        price = 200;

        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println("in static method");
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Class.forName(Mobile.class.getModule(), "Mobile"); // another way of initializing a class and its static
                                                           // block(if any)

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // Mobile.name = "Smartphone";
        // obj1.price = 1500;

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // Mobile.name = "Smartphone";
        // obj2.price = 2500;

        Mobile.name = "Phone";

        // obj1.show();
        // obj2.show();
        // Mobile.show(); // this raises a compile error

        // Mobile.show1(obj1);
    }
}
