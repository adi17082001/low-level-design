package design_patterns.abstractFactory.factories;

import design_patterns.abstractFactory.vehicles.BMW;
import design_patterns.abstractFactory.vehicles.Mercedes;
import design_patterns.abstractFactory.vehicles.Vehicle;

public class LuxuryFactory implements VehicleFactory{
    public Vehicle getVehicle(String input){
        switch(input){
            case "BMW":
                return new BMW();
            case "MERCEDES":
                return new Mercedes();
            default:
                return null;
        }
    }
}
