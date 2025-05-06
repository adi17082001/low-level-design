package design_patterns.decorator;

import design_patterns.decorator.PizzaTypes.Margherita;
import design_patterns.decorator.ToppingsDecorator.ExtraCheese;
import design_patterns.decorator.ToppingsDecorator.Mushroom;

public class Billing {
    public static void main(String[] args) {
        // decorate margherita with extra cheese
        BasePizza margheritaWithExtraCheese = new ExtraCheese(new Margherita());
        System.out.println("Margherita with extra cheese : Rs " + margheritaWithExtraCheese.cost());

        // decorate margherita with extra cheese and mushroom
        BasePizza margheritaWithExtraCheeseAndMushroom = new Mushroom(margheritaWithExtraCheese);
        System.out.println("Margherita with extra cheese and mushroom : Rs " + margheritaWithExtraCheeseAndMushroom.cost());
    }
}
