package ca.com.rentacarnada.pojo;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String vehicleId, String brand, String model, double rentalPricePerDay, int engineCapacity) {
        super(vehicleId, brand, model, rentalPricePerDay);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {

            this.engineCapacity = engineCapacity;

    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle - Vehicle ID: " + getVehicleId() + ", Brand: " + getBrand() +
                ", Model: " + getModel() + ", Engine Capacity: " + engineCapacity + "cc" +
                ", Rental Price Per Day: $" + getRentalPricePerDay());
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalPricePerDay() + (engineCapacity / 100);
    }
}
