package design_patterns.abstractFactory;

import design_patterns.abstractFactory.factories.VehicleFactory;
import design_patterns.abstractFactory.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Factory2 factory = new Factory2();
        VehicleFactory vechicleFactory = factory.getVehicleFactory("luxury");
        Vehicle vehicle = vechicleFactory.getVehicle("BMW");
        vehicle.average();

    }
}
