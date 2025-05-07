package design_patterns.abstractFactory;

import design_patterns.abstractFactory.factories.LuxuryFactory;
import design_patterns.abstractFactory.factories.OrdinaryFactory;
import design_patterns.abstractFactory.factories.VehicleFactory;

public class Factory2 {
    public VehicleFactory getVehicleFactory(String input){
        switch(input){
            case "luxury":
                return new LuxuryFactory();
            case "ordinary":
                return new OrdinaryFactory();
            default:
                return null;
        }
    }
}
