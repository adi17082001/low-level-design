package design_patterns.strategy.with_strategy;

import design_patterns.strategy.with_strategy.Strategy.DriveStrategy;

public class Vehicle {
    // Vehicle "has-a" DriveStrategy
    DriveStrategy driveObject;

    public Vehicle(DriveStrategy driveObj){  // this is called constructor injection
        this.driveObject = driveObj;
    }

    // drive method
    public void drive(){
        driveObject.drive();
    }
}
