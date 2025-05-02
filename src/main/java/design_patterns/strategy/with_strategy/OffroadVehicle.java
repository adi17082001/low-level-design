package design_patterns.strategy.with_strategy;
import design_patterns.strategy.with_strategy.Strategy.SportsDriveStrategy;


public class OffroadVehicle extends Vehicle {

    // in the below constructor, I've used the obj of SportsDriveStrategy
    public OffroadVehicle(){
        super(new SportsDriveStrategy());
    }
}
