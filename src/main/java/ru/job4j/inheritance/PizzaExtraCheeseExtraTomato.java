package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {

    private String portion = " extra tomato";

    public PizzaExtraCheeseExtraTomato(String portion) {
        super(portion);
    }

    @Override
    public String name() {
        return super.name() + portion;
    }
}
