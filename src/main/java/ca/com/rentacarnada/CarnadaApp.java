package ca.com.rentacarnada;

import ca.com.rentacarnada.pojo.*;

public class CarnadaApp {

    public static void main(String[] args) {

        VehicleRentalService vehicleRentalService = new VehicleRentalService();

        // Car instance
        Car car = new Car("101", "Toyota", "Corolla", 100.00, 5);

        // Truck instance
        Truck truck = new Truck("102", "Peterbilt Motors", "Model 589", 400.00, 20000);

        // Motorcycle instance
        Motorcycle motorcycle = new Motorcycle("103", "Honda", "NX Bros", 50.00, 500);

        // Add vehicles
        vehicleRentalService.addVehicle(car);
        vehicleRentalService.addVehicle(truck);
        vehicleRentalService.addVehicle(motorcycle);

        // Display all vehicles
        vehicleRentalService.displayAllVehicles();



        // Calculate the total rental cost
        int rentalDays = 5;
        double totalCost = vehicleRentalService.calculateTotalRentalCost(rentalDays);
        System.out.println("Total cost for " + rentalDays + " days: $" + totalCost);
    }
}
