package ca.com.rentacarnada.pojo;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String vehicleId, String brand, String model, double rentalPricePerDay, int numberOfSeats) {
        super(vehicleId, brand, model, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - Vehicle ID: " + getVehicleId() + ", Brand: " + getBrand() +
                ", Model: " + getModel() + ", Seats: " + numberOfSeats +
                ", Rental Price Per Day: $" + getRentalPricePerDay());
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalPricePerDay();
    }
}


