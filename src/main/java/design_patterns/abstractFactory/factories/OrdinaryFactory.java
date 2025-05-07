package design_patterns.abstractFactory.factories;

import design_patterns.abstractFactory.vehicles.Swift;
import design_patterns.abstractFactory.vehicles.Vehicle;
import design_patterns.abstractFactory.vehicles.WagonR;

public class OrdinaryFactory implements VehicleFactory{
    public Vehicle getVehicle(String input){
        switch(input){
            case "SWIFT":
                return new Swift();
            case "WagonR":
                return new WagonR();
            default:
                return null;
        }
    }
}
