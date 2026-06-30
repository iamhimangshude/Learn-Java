package OOP;

import java.util.ArrayList;
import java.util.List;

public class ECommFleetMgr {
    static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>(List.of(
                new Vehicle("Tesla", "MaxiTruck", 10),
                new BicycleVehicle("Hero", "Stryder"),
                new DroneVehicle("DJI", "MINI 5 PRO"),
                new Vehicle("TATA", "E8750", 20),
                new Vehicle("Mahindra", "Scorpio", 20)
        ));
        final double distance = 5;

        for (var i : vehicles) {
            System.out.println("delivery cost of " + i.getName() + " is: " + i.calculateDeliveryCost(distance));
        }
    }
}

class Vehicle {
    private String brand;
    private String model;
    private double baseDeliveryFee;

    public Vehicle(String brand, String model, double baseDeliveryFee) {
        this.brand = brand;
        this.model = model;
        this.baseDeliveryFee = baseDeliveryFee;
    }

    public double calculateDeliveryCost(double distanceInKm) {
        return distanceInKm * 1.5 + baseDeliveryFee;
    }

    public String getName() {
        return brand + " " + model;
    }
}

class DroneVehicle extends Vehicle {
    public DroneVehicle(String brand, String model) {
        super(brand, model, 10);
    }

    @Override
    public double calculateDeliveryCost(double distanceInKm) {
        return super.calculateDeliveryCost(distanceInKm) + 10;
    }
}

class BicycleVehicle extends Vehicle {
    public BicycleVehicle(String brand, String model) {
        super(brand, model, 5);
    }

    @Override
    public double calculateDeliveryCost(double distanceInKm) {
        if (distanceInKm < 3) {
            return distanceInKm * 1.5;
        }
        return super.calculateDeliveryCost(distanceInKm);
    }
}