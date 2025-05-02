package design_patterns.strategy.with_strategy.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Normal drive capability");
    }
}
