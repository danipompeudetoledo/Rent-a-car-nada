package ca.com.rentacarnada.pojo;

import java.util.ArrayList;

public class VehicleRentalService {
    private ArrayList<Vehicle> vehicles;

    public VehicleRentalService(){
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        System.out.println("Vehicle added: " + vehicle);
    }

    public void displayAllVehicles(){
        if(vehicles.isEmpty()){
            System.out.println("No vehicles available");
        }
        else{
            for (Vehicle vehicle : vehicles){
                System.out.println(vehicle);
            }
        }
    }

    public double calculateTotalRentalCost(int days) {
        double totalCost = 0.0;
        for (Vehicle vehicle : vehicles) {
            totalCost += vehicle.getRentalPricePerDay() * days;
        }
        return totalCost;
    }
}
