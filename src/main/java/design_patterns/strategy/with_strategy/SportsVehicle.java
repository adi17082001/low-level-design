package design_patterns.strategy.with_strategy;

import design_patterns.strategy.with_strategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(){
        super( new SportsDriveStrategy());
    }
}
