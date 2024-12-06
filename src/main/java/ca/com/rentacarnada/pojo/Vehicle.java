package ca.com.rentacarnada.pojo;

public abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private String model;
    private double rentalPricePerDay;

    public Vehicle(String vehicleId, String brand, String model, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public abstract void displayInfo();

    public abstract double calculateRentalCost(int days);

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Model: " + model +
                ", Rental Price Per Day: $" + rentalPricePerDay;
    }

}

