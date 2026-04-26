package oop;

public class Classes1 {
    public static void main(String[] args) {
        Car car = new Car();
        // car.make = "Porsche";
        // car.model = "Carrera";
        // car.color = "Red";
        // Above lines (6-8) will throw error because of private access modifier.

        // Below codes will work because of setters in the Car class.
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Black");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        
        car.describeCar();

        Car targa = new Car();
        targa.setMake ("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}

