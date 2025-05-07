package design_patterns.abstractFactory.factories;

import design_patterns.abstractFactory.vehicles.Vehicle;

public interface VehicleFactory {
    public Vehicle getVehicle(String input);
}
