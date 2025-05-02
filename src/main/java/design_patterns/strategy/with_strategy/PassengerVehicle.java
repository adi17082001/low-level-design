package design_patterns.strategy.with_strategy;
import design_patterns.strategy.with_strategy.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
