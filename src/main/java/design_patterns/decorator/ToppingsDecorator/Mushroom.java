package design_patterns.decorator.ToppingsDecorator;

import design_patterns.decorator.BasePizza;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return this.basePizza.cost() + 20;
    }
}
