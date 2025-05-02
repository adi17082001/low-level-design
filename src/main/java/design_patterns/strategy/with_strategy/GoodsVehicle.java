package design_patterns.strategy.with_strategy;

import design_patterns.strategy.with_strategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
