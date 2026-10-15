package OOPs;

class Laptop{
    String model;
    int price;

    // NOTE: Always use IDE generated methods for standard practices!

    // public String toString(){
    //     return this.model + " : " + this.price;
    // }

    // public boolean equals(Laptop that){
    //     return (this.model.equals(that.model) && this.price == that.price);
    // }
}

public class ClassMethods {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;

        System.out.println(obj); // this calls .toString() method behind the scene!
        // System.out.println(obj.toString());


        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga1";
        obj2.price = 1000;
        
        boolean result = obj.equals(obj2);

        System.out.println(result);
    }
}
