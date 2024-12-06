package ca.com.rentacarnada.pojo;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String vehicleId, String brand, String model, double rentalPricePerDay, double cargoCapacity) {
        super(vehicleId, brand, model, rentalPricePerDay);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
            this.cargoCapacity = cargoCapacity;

    }

    @Override
    public void displayInfo() {
        System.out.println("Truck - Vehicle ID: " + getVehicleId() + ", Brand: " + getBrand() +
                ", Model: " + getModel() + ", Cargo Capacity: " + cargoCapacity + " tons" +
                ", Rental Price Per Day: $" + getRentalPricePerDay());
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalPricePerDay() + (cargoCapacity * 10);
    }
}
