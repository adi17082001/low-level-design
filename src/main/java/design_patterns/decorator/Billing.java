package design_patterns.decorator;

import design_patterns.decorator.PizzaTypes.Margherita;
import design_patterns.decorator.ToppingsDecorator.ExtraCheese;
import design_patterns.decorator.ToppingsDecorator.Mushroom;

public class Billing {
    public static void main(String[] args) {
        BasePizza MargheritaWithExtraCheese = new ExtraCheese(new Margherita());
        System.out.println("Margherita with extra cheese : Rs " + MargheritaWithExtraCheese.cost());

        BasePizza MargheritaWithExtraCheeseAndMushroom = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Margherita with extra cheese and mushroom : Rs " + MargheritaWithExtraCheeseAndMushroom.cost());
    }
}
